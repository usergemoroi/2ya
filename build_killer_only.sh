#!/bin/bash

# Скрипт для сборки только Signature Killer (dex9) + заглушка dex8
set -e

# Цвета
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка Signature Killer (упрощённая)${NC}"
echo -e "${GREEN}========================================${NC}"

# Настройка переменных окружения
export ANDROID_HOME=~/android-sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/build-tools/34.0.0

ANDROID_JAR="$ANDROID_HOME/platforms/android-30/android.jar"

# Создание рабочих директорий
echo -e "\n${BLUE}[1/3] Создание рабочих директорий...${NC}"
rm -rf build_killer
mkdir -p build_killer/classes8 build_killer/classes9 build_killer/stubs
echo -e "${GREEN}✓ Директории созданы${NC}"

# Создание минимальной заглушки для dex8 (Yandex SDK)
echo -e "\n${BLUE}[2/3] Создание заглушек для зависимостей...${NC}"

# HiddenApiBypass
mkdir -p build_killer/stubs/org/lsposed/hiddenapibypass
cat > build_killer/stubs/org/lsposed/hiddenapibypass/HiddenApiBypass.java << 'EOF'
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

echo "Компиляция заглушек..."
javac -source 1.8 -target 1.8 -encoding UTF-8 -d build_killer/classes8 \
      build_killer/stubs/org/lsposed/hiddenapibypass/HiddenApiBypass.java 2>&1 | grep -v "warning"

echo "Создание минимального classes8.dex..."
d8 --output итог/classes8.dex \
   --lib "$ANDROID_JAR" \
   --min-api 21 \
   --release \
   $(find build_killer/classes8 -name "*.class" -type f) 2>/dev/null

echo -e "${GREEN}✓ Заглушки созданы${NC}"

# Сборка classes9.dex (Signature Killer)
echo -e "\n${BLUE}[3/3] Сборка classes9.dex (Signature Killer)...${NC}"

# Находим только основные файлы Signature Killer
find restored_code/dex9/bin/mt/signature -name "*.java" -type f > build_killer/sources9.txt

JAVA_COUNT9=$(wc -l < build_killer/sources9.txt)
echo "Найдено $JAVA_COUNT9 Java файлов Signature Killer"

if [ $JAVA_COUNT9 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Java файлы не найдены${NC}"
    exit 1
fi

echo "Компиляция Signature Killer..."
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -classpath "build_killer/classes8" \
      -d build_killer/classes9 \
      -Xlint:none \
      @build_killer/sources9.txt 2>&1 | tee build_killer/javac9.log | tail -20

CLASS_COUNT9=$(find build_killer/classes9 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT9 class файлов"

if [ $CLASS_COUNT9 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать Signature Killer${NC}"
    echo "Последние строки лога:"
    tail -50 build_killer/javac9.log
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output итог/classes9.dex \
   --lib "$ANDROID_JAR" \
   --classpath итог/classes8.dex \
   --min-api 21 \
   --release \
   $(find build_killer/classes9 -name "*.class" -type f) 2>&1

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
echo -e "${YELLOW}Примечание: classes8.dex содержит только заглушки${NC}"
echo -e "${YELLOW}classes9.dex содержит основной код Signature Killer${NC}"
