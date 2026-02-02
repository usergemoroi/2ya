# Сборка файлов classes8.dex, classes9.dex и libSignatureKiller.so

## Описание

Этот проект содержит декомпилированный исходный код из архива `restored_code.zip`.
Для получения готовых бинарных файлов необходимо собрать их из исходников.

## Требуемые файлы

1. **classes8.dex** (~9.8 MB) - Yandex Mobile Ads SDK
2. **classes9.dex** (~2.3 MB) - Signature Killer Application  
3. **libSignatureKiller.so** (21,184 bytes) - Native ARM64 library

## Системные требования

### Для сборки DEX файлов:
- Java JDK 8 или выше
- Android SDK Build Tools
- d8 (DEX compiler) или dx
- Android.jar (для компиляции против Android API)

### Для сборки .so библиотеки:
- Android NDK r21 или выше
- CMake 3.10+
- xhook library (https://github.com/iqiyi/xhook)

## Быстрая сборка

Запустите скрипт автоматической сборки:

```bash
./build_all.sh
```

Все файлы будут помещены в папку `итог/`:
- итог/classes8.dex
- итог/classes9.dex  
- итог/libSignatureKiller.so

## Ручная сборка

### 1. Сборка classes8.dex (Yandex SDK)

```bash
# Компиляция Java файлов
find ../restored_code/dex8 -name "*.java" > sources8.txt
javac -source 1.8 -target 1.8 \
      -bootclasspath $ANDROID_HOME/platforms/android-30/android.jar \
      -d build/classes8 \
      @sources8.txt

# Конвертация в DEX
d8 --output classes8.dex \
   --lib $ANDROID_HOME/platforms/android-30/android.jar \
   build/classes8/**/*.class
```

### 2. Сборка classes9.dex (Signature Killer)

```bash
# Компиляция Java/Kotlin файлов
find ../restored_code/dex9 -name "*.java" > sources9.txt
javac -source 1.8 -target 1.8 \
      -bootclasspath $ANDROID_HOME/platforms/android-30/android.jar \
      -classpath build/classes8 \
      -d build/classes9 \
      @sources9.txt

# Конвертация в DEX
d8 --output classes9.dex \
   --lib $ANDROID_HOME/platforms/android-30/android.jar \
   --classpath classes8.dex \
   build/classes9/**/*.class
```

### 3. Сборка libSignatureKiller.so

```bash
# Клонирование xhook
cd ../restored_code/native
git clone https://github.com/iqiyi/xhook.git

# Сборка с NDK
mkdir -p build && cd build
cmake -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK_HOME/build/cmake/android.toolchain.cmake \
      -DANDROID_ABI=arm64-v8a \
      -DANDROID_PLATFORM=android-21 \
      -DCMAKE_BUILD_TYPE=Release \
      ..
cmake --build .

# Копирование результата
cp libSignatureKiller.so ../../../итог/
```

## Альтернативный метод: Gradle

Можно использовать Gradle для автоматической сборки:

```bash
./gradlew assembleRelease
# DEX файлы будут в app/build/intermediates/dex/
# SO файлы будут в app/build/intermediates/cmake/
```

## Проверка результатов

После сборки проверьте файлы:

```bash
file итог/classes8.dex  # Должен показать: Dalvik dex file
file итог/classes9.dex  # Должен показать: Dalvik dex file  
file итог/libSignatureKiller.so  # Должен показать: ELF 64-bit LSB shared object, ARM aarch64

# Проверка размеров (примерно)
ls -lh итог/
# classes8.dex: ~9-10 MB
# classes9.dex: ~2-3 MB
# libSignatureKiller.so: ~21 KB
```

## Зависимости

### Java зависимости (для classes9.dex):
- Kotlin Standard Library
- OkHttp3
- Retrofit2
- Okio
- LSPosed HiddenApiBypass

### Native зависимости:
- xhook 1.2.0
- Android NDK libc, liblog, libm, libdl

## Структура проекта

```
итог/
├── README.md (этот файл)
├── build_all.sh (скрипт автоматической сборки)
├── classes8.dex (результат сборки)
├── classes9.dex (результат сборки)
└── libSignatureKiller.so (результат сборки)
```

## Примечания

1. **Декомпилированный код** может содержать артефакты декомпиляции и требовать ручных исправлений
2. **Зависимости** нужно загрузить отдельно (Kotlin stdlib, OkHttp, и т.д.)
3. **Android API level** должен соответствовать оригинальному (рекомендуется API 28-30)
4. **Подпись приложения** после сборки будет отличаться от оригинала

## Лицензия и ответственность

⚠️ **ВАЖНО**: Этот код предназначен только для образовательных целей и исследования безопасности.
Использование для обхода защиты приложений, пиратства или нарушения условий использования ПО является незаконным.

## Поддержка

Если у вас возникли проблемы со сборкой:
1. Проверьте версии установленных инструментов
2. Убедитесь что установлены все зависимости
3. Проверьте переменные окружения (ANDROID_HOME, ANDROID_NDK_HOME)
4. Прочитайте логи ошибок компиляции

---

*Документация создана автоматически на основе reverse engineering проекта*
