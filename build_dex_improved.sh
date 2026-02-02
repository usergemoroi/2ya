#!/bin/bash

# Оптимизированный скрипт сборки DEX файлов
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
echo -e "${GREEN}✓ d8 доступен${NC}"

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

download_lib() {
    local name=$1
    local url=$2
    local file=$3
    
    if [ ! -f "build/libs/$file" ] || [ ! -s "build/libs/$file" ]; then
        echo "Загрузка $name..."
        wget -q --timeout=30 --tries=2 -O "build/libs/$file" "$url" 2>/dev/null || {
            echo "Предупреждение: Не удалось загрузить $name"
            rm -f "build/libs/$file"
            return 1
        }
        
        # Проверка что файл не пустой
        if [ ! -s "build/libs/$file" ]; then
            echo "Предупреждение: $name пуст, удаляем..."
            rm -f "build/libs/$file"
            return 1
        fi
        
        echo "✓ $name загружен"
    fi
    return 0
}

# LSPosed HiddenApiBypass
download_lib "HiddenApiBypass" \
    "https://repo1.maven.org/maven2/org/lsposed/hiddenapibypass/4.3/hiddenapibypass-4.3.jar" \
    "hiddenapibypass-4.3.jar"

# OkHttp3
download_lib "OkHttp" \
    "https://repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/4.9.3/okhttp-4.9.3.jar" \
    "okhttp-4.9.3.jar"

# Okio
download_lib "Okio" \
    "https://repo1.maven.org/maven2/com/squareup/okio/okio-jvm/3.0.0/okio-jvm-3.0.0.jar" \
    "okio-jvm-3.0.0.jar"

# Kotlin stdlib
download_lib "Kotlin stdlib" \
    "https://repo1.maven.org/maven2/org/jetbrains/kotlin/kotlin-stdlib/1.6.21/kotlin-stdlib-1.6.21.jar" \
    "kotlin-stdlib-1.6.21.jar"

# Retrofit2
download_lib "Retrofit" \
    "https://repo1.maven.org/maven2/com/squareup/retrofit2/retrofit/2.9.0/retrofit-2.9.0.jar" \
    "retrofit-2.9.0.jar"

echo -e "${GREEN}✓ Зависимости готовы${NC}"

# Подготовка classpath
CLASSPATH_LIBS=""
for jar in build/libs/*.jar; do
    if [ -f "$jar" ] && [ -s "$jar" ]; then
        CLASSPATH_LIBS="$CLASSPATH_LIBS:$jar"
    fi
done

echo "Classpath libs: ${CLASSPATH_LIBS:-none}"

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
# DEX8 - это Yandex SDK, скорее всего не требует дополнительных библиотек кроме Android SDK
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -d build/classes8 \
      -Xlint:none \
      -nowarn \
      @build/sources8.txt 2>&1 | tee build/javac8.log | tail -20

CLASS_COUNT8=$(find build/classes8 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT8 class файлов"

if [ $CLASS_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать Java файлы${NC}"
    echo "Последние 50 строк лога:"
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
    tail -20 build/d8_8.log
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
# DEX9 требует classes8 + внешние библиотеки
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -classpath "build/classes8${CLASSPATH_LIBS}" \
      -d build/classes9 \
      -Xlint:none \
      -nowarn \
      @build/sources9.txt 2>&1 | tee build/javac9.log | tail -20

CLASS_COUNT9=$(find build/classes9 -name "*.class" -type f 2>/dev/null | wc -l)
echo "Скомпилировано $CLASS_COUNT9 class файлов"

if [ $CLASS_COUNT9 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать Java файлы для dex9${NC}"
    echo "Последние 50 строк лога:"
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
    tail -20 build/d8_9.log
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
ls -lh итог/*.dex 2>/dev/null | awk '{print "  " $9 " - " $5}' || echo "  Нет DEX файлов"
echo ""
echo -e "${GREEN}✓ DEX файлы готовы!${NC}"
