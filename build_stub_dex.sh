#!/bin/bash
# Создание минимальных stub DEX файлов для тестирования структуры

set -e
export ANDROID_HOME=~/android-sdk
export PATH=$PATH:$ANDROID_HOME/build-tools/34.0.0
ANDROID_JAR="$ANDROID_HOME/platforms/android-30/android.jar"

echo "Создание stub DEX файлов..."

mkdir -p build_stub/java/com/yandex/mobile/ads
mkdir -p build_stub/java/bin/mt/signature
mkdir -p build_stub/classes8 build_stub/classes9

# Создание базовой заглушки для classes8 (Yandex SDK)
cat > build_stub/java/com/yandex/mobile/ads/YandexAds.java << 'EOF'
package com.yandex.mobile.ads;
public class YandexAds {
    public static final String VERSION = "6.4.0";
    public static void initialize() {}
}
EOF

# Создание KillerApplication для classes9
cat > build_stub/java/bin/mt/signature/KillerApplication.java << 'EOF'
package bin.mt.signature;
import android.app.Application;
public class KillerApplication extends Application {
    static {
        try {
            System.loadLibrary("SignatureKiller");
        } catch (Throwable e) {}
    }
    public void onCreate() {
        super.onCreate();
    }
    private static native void hookApkPath(String packageName, String apkPath);
}
EOF

# Компиляция
javac -source 1.8 -target 1.8 -bootclasspath "$ANDROID_JAR" -d build_stub/classes8 build_stub/java/com/yandex/mobile/ads/YandexAds.java
javac -source 1.8 -target 1.8 -bootclasspath "$ANDROID_JAR" -d build_stub/classes9 build_stub/java/bin/mt/signature/KillerApplication.java

# Создание DEX
d8 --output итог/classes8.dex --lib "$ANDROID_JAR" --min-api 21 --release build_stub/classes8/com/yandex/mobile/ads/YandexAds.class
d8 --output итог/classes9.dex --lib "$ANDROID_JAR" --min-api 21 --release build_stub/classes9/bin/mt/signature/KillerApplication.class

echo "✓ Stub DEX файлы созданы"
ls -lh итог/*.dex
file итог/*.dex
