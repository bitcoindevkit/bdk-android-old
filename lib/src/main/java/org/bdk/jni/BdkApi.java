/*
 * Copyright 2020 BDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bdk.jni;

import java.nio.file.Path;
import java.util.Optional;

public class BdkApi {

    /**
     * Friendlier public facing methods to access DefiadsLib native JNI functions.
     */

    private final BdkLib bdkLib;

    public BdkApi() {
        bdkLib = new BdkLib();
    }

    public void initLogger() {
        bdkLib.initLogger();
    }

    public Optional<InitResult> initConfig(Path workDir, Network network, String passphrase,
                                           String pdPassphrase) {

        return bdkLib.initConfig(workDir.toString(), network.ordinal(), passphrase, pdPassphrase);
    }

    public Optional<Config> loadConfig(Path workDir, Network network) {

        return bdkLib.loadConfig(workDir.toString(), network.ordinal());
    }

    public Optional<Config> removeConfig(Path workDir, Network network) {
        return bdkLib.removeConfig(workDir.toString(), network.ordinal());
    }

    public Optional<Config> updateConfig(Path workDir, Network network, String[] bitcoinPeers,
                                         int bitcoinConnections, boolean bitcoinDiscovery) {
        return bdkLib.updateConfig(workDir.toString(), network.ordinal(), bitcoinPeers,
                bitcoinConnections, bitcoinDiscovery);
    }

    public void start(Path workDir, Network network, boolean rescan) {
        bdkLib.start(workDir.toString(), network.ordinal(), rescan);
    }

    public void stop() {
        bdkLib.stop();
    }

    public Optional<BalanceAmt> balance() {
        return bdkLib.balance();
    }

    public Address depositAddress() {
        return bdkLib.depositAddress();
    }

    public WithdrawTx withdraw(String passphrase, String address, long feePerVByte, long amount) {
        return bdkLib.withdraw(passphrase, address, feePerVByte, amount);
    }
}
