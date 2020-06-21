BDK Android AAR
===============

This project wraps the [bdk](https://github.com/bitcoindevkit/bdk) library in to an android aar library to be used
in an Android app.

## Build and Install bdk libraries

1. Clone bdk project (if not already cloned) and follow README instructions
   in that project to setup environment.
   
   ```
   cd ..
   git clone https://github/bitcoindevkit/bdk
   cd bdk
   more README.md
   ```

1. Build and install rust based library files for all target platform os architectures
    
   ```
   ./build-lib.sh
   ./install-lib.sh
   ```
   
1. Before running tests set library path

   osx
   ```
   export JAVA_LIBRARY_PATH=[project_home]/lib/src/test/jniLibs/x86_64
   ```
   
   linux
   ```
   export LD_LIBRARY_PATH=[project_home]/lib/src/test/jniLibs/x86_64
   ```      
   
1. Deploy AAR to local maven repository
   
   ```
   ./gradlew clean build uploadArchives
   ```