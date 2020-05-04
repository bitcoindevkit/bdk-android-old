package org.btcdk.jni;

import java.util.Optional;

class BtcDkLib {

    // Used to load the 'btcdk' library on application startup.
    static {
        System.loadLibrary("btcdk");
    }

    /**
     * Native methods that are implemented by the 'btcdk' native library,
     * which is packaged with this application.
     */

    native Optional<Config> loadConfig(String workDir, int network);

    native Optional<Config> removeConfig(String workDir, int network);

    native Optional<Config> updateConfig(String workDir, int network, String[] bitcoinPeers,
                                         int bitcoinConnections, boolean bitcoinDiscovery);

    native Optional<InitResult> initConfig(String workDir, int network, String passphrase, String pdPassphrase);

    native void start(String workDir, int network, boolean rescan);

    native void stop();

    native BalanceAmt balance();

    native Address depositAddress();
}
