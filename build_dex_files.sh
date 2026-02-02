#!/bin/bash
set -e

export ANDROID_HOME=~/android-sdk
export ANDROID_NDK_HOME=~/android-sdk/ndk/25.0.8775105
export PATH=$PATH:$ANDROID_HOME/build-tools/33.0.0

cd /home/engine/project
OUTPUT_DIR="./итог"

echo "========================================="
echo "Building classes8.dex and classes9.dex"
echo "========================================="

# Build classes8.dex
echo "[1/3] Building classes8.dex..."
mkdir -p "$OUTPUT_DIR/build/classes8"
find ./restored_code/dex8 -name "*.java" > "$OUTPUT_DIR/sources8.txt"
echo "Found $(wc -l < "$OUTPUT_DIR/sources8.txt") Java files"

javac -source 1.8 -target 1.8 -encoding UTF-8 \
  -bootclasspath "$ANDROID_HOME/platforms/android-30/android.jar" \
  -d "$OUTPUT_DIR/build/classes8" \
  @"$OUTPUT_DIR/sources8.txt" 2>&1 || true

CLASS_COUNT=$(find "$OUTPUT_DIR/build/classes8" -name "*.class" | wc -l)
echo "Compiled $CLASS_COUNT class files"

if [ $CLASS_COUNT -gt 0 ]; then
  echo "Converting to DEX..."
  ~/android-sdk/build-tools/33.0.0/d8 --output "$OUTPUT_DIR/classes8.dex" \
    --lib "$ANDROID_HOME/platforms/android-30/android.jar" \
    --min-api 21 --release \
    $(find "$OUTPUT_DIR/build/classes8" -name "*.class") 2>&1 || true
  
  if [ -f "$OUTPUT_DIR/classes8.dex" ]; then
    ls -lh "$OUTPUT_DIR/classes8.dex"
    echo "✓ classes8.dex created successfully!"
  fi
fi

# Build classes9.dex
echo ""
echo "[2/3] Building classes9.dex..."
mkdir -p "$OUTPUT_DIR/build/classes9"
find ./restored_code/dex9 -name "*.java" > "$OUTPUT_DIR/sources9.txt"
echo "Found $(wc -l < "$OUTPUT_DIR/sources9.txt") Java files"

javac -source 1.8 -target 1.8 -encoding UTF-8 \
  -bootclasspath "$ANDROID_HOME/platforms/android-30/android.jar" \
  -classpath "$OUTPUT_DIR/build/classes8:$OUTPUT_DIR/classes8.dex" \
  -d "$OUTPUT_DIR/build/classes9" \
  @"$OUTPUT_DIR/sources9.txt" 2>&1 || true

CLASS_COUNT=$(find "$OUTPUT_DIR/build/classes9" -name "*.class" 2>/dev/null | wc -l)
echo "Compiled $CLASS_COUNT class files"

if [ $CLASS_COUNT -gt 0 ]; then
  echo "Converting to DEX..."
  ~/android-sdk/build-tools/33.0.0/d8 --output "$OUTPUT_DIR/classes9.dex" \
    --lib "$ANDROID_HOME/platforms/android-30/android.jar" \
    --classpath "$OUTPUT_DIR/classes8.dex" \
    --min-api 21 --release \
    $(find "$OUTPUT_DIR/build/classes9" -name "*.class") 2>&1 || true
  
  if [ -f "$OUTPUT_DIR/classes9.dex" ]; then
    ls -lh "$OUTPUT_DIR/classes9.dex"
    echo "✓ classes9.dex created successfully!"
  fi
fi

# Build libSignatureKiller.so
echo ""
echo "[3/3] Building libSignatureKiller.so..."
cd ./restored_code/native

if [ ! -d xhook ]; then
  echo "Cloning xhook..."
  git clone https://github.com/iqiyi/xhook.git
fi

mkdir -p build && cd build
cmake -DCMAKE_TOOLCHAIN_FILE="$ANDROID_NDK_HOME/build/cmake/android.toolchain.cmake" \
  -DANDROID_ABI=arm64-v8a \
  -DANDROID_PLATFORM=android-21 \
  -DCMAKE_BUILD_TYPE=Release .. 2>&1

make 2>&1

if [ -f libSignatureKiller.so ]; then
  strip libSignatureKiller.so 2>/dev/null || true
  cp libSignatureKiller.so "../../../итог/"
  cd "../../../итог/"
  ls -lh libSignatureKiller.so
  echo "✓ libSignatureKiller.so created successfully!"
else
  echo "⚠ libSignatureKiller.so not found"
fi

# Final check
echo ""
echo "========================================="
echo "Build Complete!"
echo "========================================="
cd "/home/engine/project/итог/"
echo "Files in итог/:"
ls -lh classes*.dex libSignatureKiller.so 2>/dev/null || true

echo ""
echo "File types:"
file classes8.dex 2>/dev/null || echo "classes8.dex: not found"
file classes9.dex 2>/dev/null || echo "classes9.dex: not found"
file libSignatureKiller.so 2>/dev/null || echo "libSignatureKiller.so: not found"
