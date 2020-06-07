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

import java.util.Optional;

class BdkLib {

    // Used to load the 'bdk' library on application startup.
    static {
        System.loadLibrary("bdk");
    }

    /**
     * Native methods that are implemented by the 'bdk' native library,
     * which is packaged with this application.
     */

    native void initLogger();

    native Optional<Config> loadConfig(String workDir, int network);

    native Optional<Config> removeConfig(String workDir, int network);

    native Optional<Config> updateConfig(String workDir, int network, String[] bitcoinPeers,
                                         int bitcoinConnections, boolean bitcoinDiscovery);

    native Optional<InitResult> initConfig(String workDir, int network, String passphrase, String pdPassphrase);

    native void start(String workDir, int network, boolean rescan);

    native void stop();

    native Optional<BalanceAmt> balance();

    native Address depositAddress();

    native WithdrawTx withdraw(String passphrase, String address, long feePerVByte, long amount);
}
