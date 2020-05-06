package org.btcdk.jni;

import java.nio.file.Path;
import java.util.Optional;

public class BtcDkApi {

    /**
     * Friendlier public facing methods to access DefiadsLib native JNI functions.
     */

    private final BtcDkLib btcDkLib;

    public BtcDkApi() {
        btcDkLib = new BtcDkLib();
    }

    public Optional<InitResult> initConfig(Path workDir, Network network, String passphrase,
                                           String pdPassphrase) {

        return btcDkLib.initConfig(workDir.toString(), network.ordinal(), passphrase, pdPassphrase);
    }

    public Optional<Config> loadConfig(Path workDir, Network network) {

        return btcDkLib.loadConfig(workDir.toString(), network.ordinal());
    }

    public Optional<Config> removeConfig(Path workDir, Network network) {
        return btcDkLib.removeConfig(workDir.toString(), network.ordinal());
    }

    public Optional<Config> updateConfig(Path workDir, Network network, String[] bitcoinPeers,
                                         int bitcoinConnections, boolean bitcoinDiscovery) {
        return btcDkLib.updateConfig(workDir.toString(), network.ordinal(), bitcoinPeers,
                bitcoinConnections, bitcoinDiscovery);
    }

    public void start(Path workDir, Network network, boolean rescan) {
        btcDkLib.start(workDir.toString(), network.ordinal(), rescan);
    }

    public void stop() {
        btcDkLib.stop();
    }

    public BalanceAmt balance() {
        return btcDkLib.balance();
    }

    public Address depositAddress() {
        return btcDkLib.depositAddress();
    }

    public WithdrawTx withdraw(String passphrase, String address, long feePerVByte, long amount) {
        return btcDkLib.withdraw(passphrase, address, feePerVByte, amount);
    }
}
