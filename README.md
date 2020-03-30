BTCDK Android AAR
=================

This project wraps the [btcdk](https://github.com/btcdk/btcdk) library in to an android aar library to be used
in an Android app.

## Build and Install btcdk libraries

1. Clone btcdk project (if not already cloned) and follow README instructions
   in that project to setup environment.
   
   ```
   cd ..
   git clone https://github/btcdk/btcdk
   cd btcdk
   more README.md
   ```

1. Build and install rust based library files for all target platform os architectures
    
   ```
   ./build-lib.sh
   ./install-lib.sh
   ```
   
1. Deploy AAR to local maven repository
   
   ```
   export JAVA_LIBRARY_PATH=[project_home]/lib/src/main/jniLibs/x86_64
   gradle clean build uploadArchives
   ```