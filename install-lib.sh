#!/bin/bash
cp ../bdk/target/x86_64-apple-darwin/release/libbdk.dylib lib/src/main/jniLibs/x86_64/libbdk.dylib
cp ../bdk/target/x86_64-linux-android/release/libbdk.so lib/src/main/jniLibs/x86_64/libbdk.so
cp ../bdk/target/aarch64-linux-android/release/libbdk.so lib/src/main/jniLibs/arm64-v8a/libbdk.so
cp ../bdk/target/armv7-linux-androideabi/release/libbdk.so lib/src/main/jniLibs/armeabi-v7a/libbdk.so
cp ../bdk/target/i686-linux-android/release/libbdk.so lib/src/main/jniLibs/x86/libbdk.so
echo installed!
