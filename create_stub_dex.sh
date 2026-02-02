#!/bin/bash
set -e

export ANDROID_HOME=~/android-sdk
TARGET_DIR="/home/engine/project/итог"

echo "Creating minimal stub DEX files..."

# Create a minimal Java class that compiles
rm -rf /tmp/stub_dex
mkdir -p /tmp/stub_dex/src8 /tmp/stub_dex/src9 /tmp/stub_dex/out8 /tmp/stub_dex/out9

# Create stub for classes8.dex (Yandex SDK placeholder)
cat > /tmp/stub_dex/src8/YandexStub.java << 'EOF'
package com.yandex.mobile.ads;
public class YandexStub {
    public static final String VERSION = "6.4.0";
    public static void init() {
        System.out.println("Yandex Mobile Ads SDK Stub");
    }
}
EOF

# Create stub for classes9.dex (Signature Killer placeholder)
cat > /tmp/stub_dex/src9/SignatureKiller.java << 'EOF'
package com.signaturekiller;
public class SignatureKiller {
    public static final String VERSION = "1.0.0";
    public static void bypass() {
        System.loadLibrary("SignatureKiller");
    }
}
EOF

# Compile stubs
echo "Compiling stub classes..."
javac -source 1.8 -target 1.8 -d /tmp/stub_dex/classes8 /tmp/stub_dex/src8/YandexStub.java
javac -source 1.8 -target 1.8 -d /tmp/stub_dex/classes9 /tmp/stub_dex/src9/SignatureKiller.java

# Convert to DEX
echo "Converting to DEX format..."
~/android-sdk/build-tools/33.0.0/d8 --output /tmp/stub_dex/out8 \
  --min-api 21 --release \
  /tmp/stub_dex/classes8/com/yandex/mobile/ads/YandexStub.class

~/android-sdk/build-tools/33.0.0/d8 --output /tmp/stub_dex/out9 \
  --min-api 21 --release \
  /tmp/stub_dex/classes9/com/signaturekiller/SignatureKiller.class

# Copy to target directory (d8 creates classes.dex by default)
cp /tmp/stub_dex/out8/classes.dex "$TARGET_DIR/classes8.dex"
cp /tmp/stub_dex/out9/classes.dex "$TARGET_DIR/classes9.dex"

echo "✓ Stub DEX files created!"
ls -lh "$TARGET_DIR"/classes*.dex
file "$TARGET_DIR"/classes8.dex
file "$TARGET_DIR"/classes9.dex
