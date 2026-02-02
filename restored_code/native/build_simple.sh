#!/bin/bash
set -e

export ANDROID_NDK_HOME=~/android-sdk/ndk/25.0.8775105
export TOOLCHAIN=$ANDROID_NDK_HOME/toolchains/llvm/prebuilt/linux-x86_64
export TARGET=aarch64-linux-android
export API=21
export AR=$TOOLCHAIN/bin/llvm-ar
export CC=$TOOLCHAIN/bin/${TARGET}${API}-clang
export CXX=$TOOLCHAIN/bin/${TARGET}${API}-clang++
export LD=$TOOLCHAIN/bin/ld
export RANLIB=$TOOLCHAIN/bin/llvm-ranlib
export STRIP=$TOOLCHAIN/bin/llvm-strip

cd /home/engine/project/restored_code/native
rm -rf build_simple
mkdir -p build_simple

echo "Building xhook..."
$CC -c -fPIC -O2 \
  xhook/libxhook/jni/xh_core.c \
  xhook/libxhook/jni/xh_elf.c \
  xhook/libxhook/jni/xh_jni.c \
  xhook/libxhook/jni/xh_log.c \
  xhook/libxhook/jni/xh_util.c \
  xhook/libxhook/jni/xh_version.c \
  xhook/libxhook/jni/xhook.c \
  -Ixhook/libxhook/jni

mv *.o build_simple/

echo "Building SignatureKiller..."
$CXX -std=c++11 -c -fPIC -O2 -fvisibility=hidden \
  -Iinclude -Ixhook/libxhook/jni \
  src/signature_killer.cpp \
  src/advanced_bypass_stub.cpp

mv *.o build_simple/

echo "Linking..."
cd build_simple
$CXX -shared -O2 -s -Wl,--exclude-libs,ALL \
  *.o \
  -o libSignatureKiller.so \
  -llog -landroid -ldl

$STRIP libSignatureKiller.so

echo "Copying to output directory..."
cp libSignatureKiller.so "/home/engine/project/итог/"

echo "✓ Build complete!"
file "/home/engine/project/итог/libSignatureKiller.so"
ls -lh "/home/engine/project/итог/libSignatureKiller.so"
