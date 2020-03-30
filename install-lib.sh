#!/bin/bash
cp ../btcdk/target/x86_64-apple-darwin/release/libbtcdk.dylib lib/src/main/jniLibs/x86_64/libbtcdk.dylib
cp ../btcdk/target/x86_64-linux-android/release/libbtcdk.so lib/src/main/jniLibs/x86_64/libbtcdk.so
cp ../btcdk/target/aarch64-linux-android/release/libbtcdk.so lib/src/main/jniLibs/arm64-v8a/libbtcdk.so
cp ../btcdk/target/armv7-linux-androideabi/release/libbtcdk.so lib/src/main/jniLibs/armeabi-v7a/libbtcdk.so
cp ../btcdk/target/i686-linux-android/release/libbtcdk.so lib/src/main/jniLibs/x86/libbtcdk.so
echo installed!
