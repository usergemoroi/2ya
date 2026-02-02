#!/bin/bash

# Скрипт автоматической сборки classes8.dex, classes9.dex и libSignatureKiller.so
# Из декомпилированного исходного кода

set -e  # Остановка при ошибке

# Цвета для вывода
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

echo -e "${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка файлов Signature Killer${NC}"
echo -e "${GREEN}========================================${NC}"

# Проверка наличия необходимых инструментов
echo -e "\n${YELLOW}[1/5] Проверка инструментов...${NC}"

# Проверка Java
if ! command -v javac &> /dev/null; then
    echo -e "${RED}ОШИБКА: javac не найден. Установите JDK 8+${NC}"
    echo "Ubuntu/Debian: sudo apt install default-jdk"
    echo "macOS: brew install openjdk@8"
    exit 1
fi
echo -e "${GREEN}✓ Java: $(javac -version 2>&1)${NC}"

# Проверка d8 (Android SDK)
if ! command -v d8 &> /dev/null; then
    echo -e "${RED}ОШИБКА: d8 не найден. Установите Android SDK Build Tools${NC}"
    echo "Установите Android SDK и добавьте build-tools в PATH"
    echo "PATH example: export PATH=\$PATH:\$ANDROID_HOME/build-tools/33.0.0"
    exit 1
fi
echo -e "${GREEN}✓ d8 найден${NC}"

# Проверка ANDROID_HOME
if [ -z "$ANDROID_HOME" ]; then
    echo -e "${RED}ОШИБКА: ANDROID_HOME не установлен${NC}"
    echo "Пример: export ANDROID_HOME=~/Android/Sdk"
    exit 1
fi
echo -e "${GREEN}✓ ANDROID_HOME: $ANDROID_HOME${NC}"

# Проверка android.jar
ANDROID_JAR="$ANDROID_HOME/platforms/android-30/android.jar"
if [ ! -f "$ANDROID_JAR" ]; then
    echo -e "${YELLOW}Предупреждение: android.jar не найден в platforms/android-30${NC}"
    # Попытка найти любую версию
    ANDROID_JAR=$(find "$ANDROID_HOME/platforms" -name "android.jar" -type f | head -n 1)
    if [ -z "$ANDROID_JAR" ]; then
        echo -e "${RED}ОШИБКА: android.jar не найден ни в одной версии платформы${NC}"
        exit 1
    fi
    echo -e "${GREEN}✓ Используется: $ANDROID_JAR${NC}"
else
    echo -e "${GREEN}✓ android.jar найден${NC}"
fi

# Создание рабочих директорий
echo -e "\n${YELLOW}[2/5] Создание рабочих директорий...${NC}"
mkdir -p build/classes8 build/classes9 build/temp
echo -e "${GREEN}✓ Директории созданы${NC}"

# Сборка classes8.dex (Yandex SDK)
echo -e "\n${YELLOW}[3/5] Сборка classes8.dex (Yandex Mobile Ads SDK)...${NC}"

# Поиск всех Java файлов в dex8
if [ ! -d "../restored_code/dex8" ]; then
    echo -e "${RED}ОШИБКА: Директория ../restored_code/dex8 не найдена${NC}"
    exit 1
fi

echo "Поиск Java файлов в dex8..."
find ../restored_code/dex8 -name "*.java" > build/sources8.txt
JAVA_COUNT8=$(wc -l < build/sources8.txt)
echo "Найдено $JAVA_COUNT8 Java файлов"

if [ $JAVA_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Java файлы не найдены в dex8${NC}"
    exit 1
fi

echo "Компиляция Java файлов..."
javac -source 1.8 -target 1.8 \
      -encoding UTF-8 \
      -bootclasspath "$ANDROID_JAR" \
      -d build/classes8 \
      -Xlint:-options \
      @build/sources8.txt 2>&1 | tee build/javac8.log || true

# Проверка наличия скомпилированных файлов
CLASS_COUNT8=$(find build/classes8 -name "*.class" -type f | wc -l)
echo "Скомпилировано $CLASS_COUNT8 class файлов"

if [ $CLASS_COUNT8 -eq 0 ]; then
    echo -e "${RED}ОШИБКА: Не удалось скомпилировать Java файлы${NC}"
    echo "См. build/javac8.log для подробностей"
    exit 1
fi

echo "Конвертация в DEX формат..."
d8 --output classes8.dex \
   --lib "$ANDROID_JAR" \
   --min-api 21 \
   --release \
   $(find build/classes8 -name "*.class" -type f) 2>&1 | tee build/d8_8.log || {
    echo -e "${RED}ОШИБКА: d8 завершился с ошибкой${NC}"
    exit 1
}

if [ ! -f "classes8.dex" ]; then
    echo -e "${RED}ОШИБКА: classes8.dex не создан${NC}"
    exit 1
fi

DEX8_SIZE=$(stat -f%z "classes8.dex" 2>/dev/null || stat -c%s "classes8.dex" 2>/dev/null)
echo -e "${GREEN}✓ classes8.dex создан ($(numfmt --to=iec-i --suffix=B $DEX8_SIZE 2>/dev/null || echo "$DEX8_SIZE bytes"))${NC}"

# Сборка classes9.dex (Signature Killer)
echo -e "\n${YELLOW}[4/5] Сборка classes9.dex (Signature Killer Application)...${NC}"

if [ ! -d "../restored_code/dex9" ]; then
    echo -e "${RED}ОШИБКА: Директория ../restored_code/dex9 не найдена${NC}"
    exit 1
fi

echo "Поиск Java файлов в dex9..."
find ../restored_code/dex9 -name "*.java" > build/sources9.txt
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
      -classpath "build/classes8:classes8.dex" \
      -d build/classes9 \
      -Xlint:-options \
      @build/sources9.txt 2>&1 | tee build/javac9.log || true

CLASS_COUNT9=$(find build/classes9 -name "*.class" -type f | wc -l)
echo "Скомпилировано $CLASS_COUNT9 class файлов"

if [ $CLASS_COUNT9 -eq 0 ]; then
    echo -e "${YELLOW}Предупреждение: Не удалось скомпилировать Java файлы для dex9${NC}"
    echo "Возможно отсутствуют зависимости (Kotlin, OkHttp, Retrofit)"
    echo "См. build/javac9.log для подробностей"
    # Создаем минимальный DEX
    touch build/classes9/dummy.class
fi

echo "Конвертация в DEX формат..."
d8 --output classes9.dex \
   --lib "$ANDROID_JAR" \
   --classpath classes8.dex \
   --min-api 21 \
   --release \
   $(find build/classes9 -name "*.class" -type f) 2>&1 | tee build/d8_9.log || {
    echo -e "${YELLOW}Предупреждение: d8 завершился с предупреждениями${NC}"
}

if [ -f "classes9.dex" ]; then
    DEX9_SIZE=$(stat -f%z "classes9.dex" 2>/dev/null || stat -c%s "classes9.dex" 2>/dev/null)
    echo -e "${GREEN}✓ classes9.dex создан ($(numfmt --to=iec-i --suffix=B $DEX9_SIZE 2>/dev/null || echo "$DEX9_SIZE bytes"))${NC}"
else
    echo -e "${YELLOW}⚠ classes9.dex не создан (возможно нужны зависимости)${NC}"
fi

# Сборка libSignatureKiller.so
echo -e "\n${YELLOW}[5/5] Сборка libSignatureKiller.so...${NC}"

if [ -z "$ANDROID_NDK_HOME" ]; then
    echo -e "${YELLOW}Предупреждение: ANDROID_NDK_HOME не установлен${NC}"
    echo "Пропуск сборки libSignatureKiller.so"
    echo "Для сборки установите: export ANDROID_NDK_HOME=~/Android/Sdk/ndk/25.0.8775105"
else
    echo "NDK: $ANDROID_NDK_HOME"
    
    # Проверка наличия native директории
    if [ ! -d "../restored_code/native" ]; then
        echo -e "${RED}ОШИБКА: Директория ../restored_code/native не найдена${NC}"
    else
        cd ../restored_code/native
        
        # Клонирование xhook если еще не клонирован
        if [ ! -d "xhook" ]; then
            echo "Клонирование xhook..."
            git clone https://github.com/iqiyi/xhook.git || {
                echo -e "${YELLOW}Предупреждение: Не удалось клонировать xhook${NC}"
            }
        fi
        
        # Сборка с CMake
        if [ -f "CMakeLists.txt" ] && [ -d "xhook" ]; then
            mkdir -p build && cd build
            echo "Запуск CMake..."
            cmake -DCMAKE_TOOLCHAIN_FILE="$ANDROID_NDK_HOME/build/cmake/android.toolchain.cmake" \
                  -DANDROID_ABI=arm64-v8a \
                  -DANDROID_PLATFORM=android-21 \
                  -DCMAKE_BUILD_TYPE=Release \
                  .. && \
            cmake --build . && \
            cp libSignatureKiller.so ../../../итог/ && \
            cd ../../.. && \
            echo -e "${GREEN}✓ libSignatureKiller.so создан${NC}" || {
                echo -e "${YELLOW}⚠ Не удалось собрать libSignatureKiller.so${NC}"
                cd ../../..
            }
        else
            echo -e "${YELLOW}⚠ CMakeLists.txt или xhook не найдены${NC}"
            cd ../../..
        fi
    fi
fi

# Итоговая информация
echo -e "\n${GREEN}========================================${NC}"
echo -e "${GREEN}Сборка завершена!${NC}"
echo -e "${GREEN}========================================${NC}"

echo -e "\nФайлы в папке ${YELLOW}итог/${NC}:"
ls -lh classes*.dex libSignatureKiller.so 2>/dev/null | awk '{print $9 " - " $5}' || {
    echo "classes8.dex - $(ls -lh classes8.dex 2>/dev/null | awk '{print $5}')"
    [ -f "classes9.dex" ] && echo "classes9.dex - $(ls -lh classes9.dex 2>/dev/null | awk '{print $5}')"
    [ -f "libSignatureKiller.so" ] && echo "libSignatureKiller.so - $(ls -lh libSignatureKiller.so 2>/dev/null | awk '{print $5}')"
}

echo -e "\n${GREEN}Используйте эти файлы для интеграции в Android приложение${NC}"
echo -e "${YELLOW}Примечание: Для полной функциональности могут потребоваться дополнительные зависимости${NC}"
