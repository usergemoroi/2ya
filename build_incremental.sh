#!/bin/bash

# Инкрементальная сборка DEX файлов - компилируем файлы по одному
set -e

# Цвета
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${GREEN}========================================${NC}"
echo -e "${GREEN}Инкрементальная сборка DEX файлов${NC}"
echo -e "${GREEN}========================================${NC}"

# Настройка переменных окружения
export ANDROID_HOME=~/android-sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/build-tools/34.0.0

ANDROID_JAR="$ANDROID_HOME/platforms/android-30/android.jar"

# Создание рабочих директорий
echo -e "\n${BLUE}[1/4] Создание рабочих директорий...${NC}"
rm -rf build_incr
mkdir -p build_incr/classes8 build_incr/classes9 build_incr/stubs/org/lsposed/hiddenapibypass
echo -e "${GREEN}✓ Директории созданы${NC}"

# Создание минимальных заглушек
echo -e "\n${BLUE}[2/4] Создание заглушек...${NC}"
cat > build_incr/stubs/org/lsposed/hiddenapibypass/HiddenApiBypass.java << 'EOF'
package org.lsposed.hiddenapibypass;
import java.lang.reflect.Method;
import java.util.List;
public class HiddenApiBypass {
    public static boolean addHiddenApiExemptions(String... signaturePrefixes) {
        return true;
    }
    public static List<Method> getDeclaredMethods(Class<?> clazz) {
        try {
            return java.util.Arrays.asList(clazz.getDeclaredMethods());
        } catch (Throwable e) {
            return java.util.Collections.emptyList();
        }
    }
}
EOF

javac -source 1.8 -target 1.8 -encoding UTF-8 -d build_incr/classes9 \
      build_incr/stubs/org/lsposed/hiddenapibypass/HiddenApiBypass.java

echo -e "${GREEN}✓ Заглушки созданы${NC}"

# Сборка classes8.dex
echo -e "\n${BLUE}[3/4] Сборка classes8.dex...${NC}"
find restored_code/dex8 -name "*.java" -type f > build_incr/sources8.txt
TOTAL=$(wc -l < build_incr/sources8.txt)
echo "Найдено $TOTAL Java файлов"

SUCCESS=0
FAILED=0

echo "Компиляция файлов (макс 20 ошибок выводится)..."

while IFS= read -r file; do
    javac -source 1.8 -target 1.8 -encoding UTF-8 \
          -bootclasspath "$ANDROID_JAR" \
          -d build_incr/classes8 \
          "$file" 2>/dev/null && SUCCESS=$((SUCCESS+1)) || FAILED=$((FAILED+1))
done < build_incr/sources8.txt

echo "Успешно: $SUCCESS, Ошибок: $FAILED"

CLASS_COUNT8=$(find build_incr/classes8 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT8 class файлов"

if [ $CLASS_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать ни одного файла${NC}"
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output итог/classes8.dex \
   --lib "$ANDROID_JAR" \
   --min-api 21 \
   --release \
   $(find build_incr/classes8 -name "*.class" -type f)

if [ ! -f "итог/classes8.dex" ]; then
    echo -e "${RED}ОШИБКА: classes8.dex не создан${NC}"
    exit 1
fi

DEX8_SIZE=$(stat -c%s "итог/classes8.dex" 2>/dev/null)
echo -e "${GREEN}✓ classes8.dex создан ($DEX8_SIZE bytes)${NC}"

# Сборка classes9.dex
echo -e "\n${BLUE}[4/4] Сборка classes9.dex...${NC}"
find restored_code/dex9 -name "*.java" -type f > build_incr/sources9.txt
TOTAL=$(wc -l < build_incr/sources9.txt)
echo "Найдено $TOTAL Java файлов"

SUCCESS=0
FAILED=0

while IFS= read -r file; do
    javac -source 1.8 -target 1.8 -encoding UTF-8 \
          -bootclasspath "$ANDROID_JAR" \
          -classpath "build_incr/classes8:build_incr/classes9" \
          -d build_incr/classes9 \
          "$file" 2>/dev/null && SUCCESS=$((SUCCESS+1)) || FAILED=$((FAILED+1))
done < build_incr/sources9.txt

echo "Успешно: $SUCCESS, Ошибок: $FAILED"

CLASS_COUNT9=$(find build_incr/classes9 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT9 class файлов"

if [ $CLASS_COUNT9 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать ни одного файла для dex9${NC}"
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output итог/classes9.dex \
   --lib "$ANDROID_JAR" \
   --classpath итог/classes8.dex \
   --min-api 21 \
   --release \
   $(find build_incr/classes9 -name "*.class" -type f)

if [ ! -f "итог/classes9.dex" ]; then
    echo -e "${RED}ОШИБКА: classes9.dex не создан${NC}"
    exit 1
fi

DEX9_SIZE=$(stat -c%s "итог/classes9.dex" 2>/dev/null)
echo -e "${GREEN}✓ classes9.dex создан ($DEX9_SIZE bytes)${NC}"

# Проверка
echo -e "\n${BLUE}Проверка DEX файлов...${NC}"
file итог/classes8.dex | grep -q "Dalvik dex" && echo -e "${GREEN}✓ classes8.dex валиден${NC}"
file итог/classes9.dex | grep -q "Dalvik dex" && echo -e "${GREEN}✓ classes9.dex валиден${NC}"

echo -e "\n${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка завершена!${NC}"
echo -e "${GREEN}========================================${NC}"
ls -lh итог/*.dex 2>/dev/null | awk '{print "  " $9 " - " $5}'
echo ""
