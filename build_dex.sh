#!/bin/bash

# Улучшенный скрипт сборки DEX файлов с автоматическим исправлением ошибок
set -e

# Цвета
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка Signature Killer DEX файлов${NC}"
echo -e "${GREEN}========================================${NC}"

# Настройка переменных окружения
export ANDROID_HOME=~/android-sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/build-tools/34.0.0

# Проверка инструментов
echo -e "\n${BLUE}[1/6] Проверка инструментов...${NC}"

if ! command -v javac &> /dev/null; then
    echo -e "${RED}ОШИБКА: javac не найден${NC}"
    exit 1
fi
echo -e "${GREEN}✓ javac: $(javac -version 2>&1)${NC}"

if ! command -v d8 &> /dev/null; then
    echo -e "${RED}ОШИБКА: d8 не найден${NC}"
    exit 1
fi
echo -e "${GREEN}✓ d8: $(d8 --version 2>&1 | head -1)${NC}"

ANDROID_JAR="$ANDROID_HOME/platforms/android-30/android.jar"
if [ ! -f "$ANDROID_JAR" ]; then
    echo -e "${RED}ОШИБКА: android.jar не найден${NC}"
    exit 1
fi
echo -e "${GREEN}✓ android.jar найден${NC}"

# Создание рабочих директорий
echo -e "\n${BLUE}[2/6] Создание рабочих директорий...${NC}"
rm -rf build
mkdir -p build/classes8 build/classes9 build/libs
echo -e "${GREEN}✓ Директории созданы${NC}"

# Скачивание недостающих библиотек
echo -e "\n${BLUE}[3/6] Загрузка зависимостей...${NC}"

# LSPosed HiddenApiBypass
if [ ! -f "build/libs/HiddenApiBypass-4.3.jar" ]; then
    echo "Загрузка HiddenApiBypass..."
    wget -q -O build/libs/HiddenApiBypass-4.3.jar \
        "https://repo1.maven.org/maven2/org/lsposed/hiddenapibypass/4.3/hiddenapibypass-4.3.jar" || \
    echo "Предупреждение: Не удалось загрузить HiddenApiBypass"
fi

# OkHttp3
if [ ! -f "build/libs/okhttp-4.9.3.jar" ]; then
    echo "Загрузка OkHttp..."
    wget -q -O build/libs/okhttp-4.9.3.jar \
        "https://repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/4.9.3/okhttp-4.9.3.jar" || \
    echo "Предупреждение: Не удалось загрузить OkHttp"
fi

# Okio
if [ ! -f "build/libs/okio-2.10.0.jar" ]; then
    echo "Загрузка Okio..."
    wget -q -O build/libs/okio-2.10.0.jar \
        "https://repo1.maven.org/maven2/com/squareup/okio/okio/2.10.0/okio-2.10.0.jar" || \
    echo "Предупреждение: Не удалось загрузить Okio"
fi

# Kotlin stdlib
if [ ! -f "build/libs/kotlin-stdlib-1.6.21.jar" ]; then
    echo "Загрузка Kotlin stdlib..."
    wget -q -O build/libs/kotlin-stdlib-1.6.21.jar \
        "https://repo1.maven.org/maven2/org/jetbrains/kotlin/kotlin-stdlib/1.6.21/kotlin-stdlib-1.6.21.jar" || \
    echo "Предупреждение: Не удалось загрузить Kotlin stdlib"
fi

# Retrofit2
if [ ! -f "build/libs/retrofit-2.9.0.jar" ]; then
    echo "Загрузка Retrofit..."
    wget -q -O build/libs/retrofit-2.9.0.jar \
        "https://repo1.maven.org/maven2/com/squareup/retrofit2/retrofit/2.9.0/retrofit-2.9.0.jar" || \
    echo "Предупреждение: Не удалось загрузить Retrofit"
fi

echo -e "${GREEN}✓ Зависимости готовы${NC}"

# Сборка classes8.dex (Yandex Mobile Ads SDK)
echo -e "\n${BLUE}[4/6] Сборка classes8.dex (Yandex SDK)...${NC}"

echo "Поиск Java файлов..."
find restored_code/dex8 -name "*.java" -type f > build/sources8.txt
JAVA_COUNT8=$(wc -l < build/sources8.txt)
echo "Найдено $JAVA_COUNT8 Java файлов"

if [ $JAVA_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Java файлы не найдены в dex8${NC}"
    exit 1
fi

echo "Компиляция Java файлов (это может занять несколько минут)..."
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -classpath "build/libs/*" \
      -d build/classes8 \
      -Xlint:none \
      -nowarn \
      @build/sources8.txt 2>&1 | tee build/javac8.log | grep -E "error:|warning:" || true

CLASS_COUNT8=$(find build/classes8 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT8 class файлов"

if [ $CLASS_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать Java файлы${NC}"
    echo "См. build/javac8.log для подробностей"
    tail -50 build/javac8.log
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output итог/classes8.dex \
   --lib "$ANDROID_JAR" \
   --min-api 21 \
   --release \
   $(find build/classes8 -name "*.class" -type f) 2>&1 | tee build/d8_8.log

if [ ! -f "итог/classes8.dex" ]; then
    echo -e "${RED}ОШИБКА: classes8.dex не создан${NC}"
    exit 1
fi

DEX8_SIZE=$(stat -c%s "итог/classes8.dex" 2>/dev/null)
echo -e "${GREEN}✓ classes8.dex создан ($(numfmt --to=iec-i --suffix=B $DEX8_SIZE 2>/dev/null || echo "$DEX8_SIZE bytes"))${NC}"

# Сборка classes9.dex (Signature Killer)
echo -e "\n${BLUE}[5/6] Сборка classes9.dex (Signature Killer)...${NC}"

echo "Поиск Java файлов..."
find restored_code/dex9 -name "*.java" -type f > build/sources9.txt
JAVA_COUNT9=$(wc -l < build/sources9.txt)
echo "Найдено $JAVA_COUNT9 Java файлов"

if [ $JAVA_COUNT9 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Java файлы не найдены в dex9${NC}"
    exit 1
fi

echo "Компиляция Java файлов..."
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -classpath "build/classes8:build/libs/*" \
      -d build/classes9 \
      -Xlint:none \
      -nowarn \
      @build/sources9.txt 2>&1 | tee build/javac9.log | grep -E "error:|warning:" || true

CLASS_COUNT9=$(find build/classes9 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT9 class файлов"

if [ $CLASS_COUNT9 -eq 0 ]; then
    echo -e "${YELLOW}Предупреждение: Не удалось скомпилировать Java файлы для dex9${NC}"
    echo "См. build/javac9.log для подробностей"
    tail -50 build/javac9.log
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output итог/classes9.dex \
   --lib "$ANDROID_JAR" \
   --classpath итог/classes8.dex \
   --min-api 21 \
   --release \
   $(find build/classes9 -name "*.class" -type f) 2>&1 | tee build/d8_9.log

if [ ! -f "итог/classes9.dex" ]; then
    echo -e "${RED}ОШИБКА: classes9.dex не создан${NC}"
    exit 1
fi

DEX9_SIZE=$(stat -c%s "итог/classes9.dex" 2>/dev/null)
echo -e "${GREEN}✓ classes9.dex создан ($(numfmt --to=iec-i --suffix=B $DEX9_SIZE 2>/dev/null || echo "$DEX9_SIZE bytes"))${NC}"

# Проверка валидности DEX файлов
echo -e "\n${BLUE}[6/6] Проверка DEX файлов...${NC}"

file итог/classes8.dex | grep -q "Dalvik dex" && \
    echo -e "${GREEN}✓ classes8.dex валиден${NC}" || \
    echo -e "${YELLOW}⚠ classes8.dex может быть невалиден${NC}"

file итог/classes9.dex | grep -q "Dalvik dex" && \
    echo -e "${GREEN}✓ classes9.dex валиден${NC}" || \
    echo -e "${YELLOW}⚠ classes9.dex может быть невалиден${NC}"

# Итоговая информация
echo -e "\n${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка DEX файлов завершена!${NC}"
echo -e "${GREEN}========================================${NC}"
echo ""
echo "Файлы в папке итог/:"
ls -lh итог/*.dex 2>/dev/null | awk '{print "  " $9 " - " $5}'
echo ""
echo -e "${GREEN}✓ Готово!${NC}"
