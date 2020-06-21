#!/bin/bash

OS=`uname`
if [ "$OS" = "Darwin" ]
then
  echo "installing apple darwin x86_64 libbdk.dylib"
  cp ../bdk/target/x86_64-apple-darwin/release/libbdk.dylib lib/src/test/jniLibs/x86_64/libbdk.dylib
elif [ "$OS" = "Linux" ]
then
  echo "installing linux x86_64 libbdk.so"
  cp ../bdk/target/x86_64-unknown-linux-gnu/release/libbdk.so lib/src/test/jniLibs/x86_64/libbdk.so
fi

echo "installing android x86_64 libbdk.so"
cp ../bdk/target/x86_64-linux-android/release/libbdk.so lib/src/main/jniLibs/x86_64/libbdk.so

echo "installing android aarch64 libbdk.so"
cp ../bdk/target/aarch64-linux-android/release/libbdk.so lib/src/main/jniLibs/arm64-v8a/libbdk.so

echo "installing android armv7 libbdk.so"
cp ../bdk/target/armv7-linux-androideabi/release/libbdk.so lib/src/main/jniLibs/armeabi-v7a/libbdk.so

echo "installing android i686 libbdk.so"
cp ../bdk/target/i686-linux-android/release/libbdk.so lib/src/main/jniLibs/x86/libbdk.so
