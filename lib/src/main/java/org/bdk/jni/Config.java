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

public class Config {

    private Network network;

    private String[] bitcoinPeers;

    private int bitcoinConnections;

    private boolean bitcoinDiscovery;

    public Config(int networkEnumOrdinal, String[] bitcoinPeers, int bitcoinConnections, boolean bitcoinDiscovery) {

        this.network = Network.values()[networkEnumOrdinal];
        this.bitcoinPeers = bitcoinPeers;
        this.bitcoinConnections = bitcoinConnections;
        this.bitcoinDiscovery = bitcoinDiscovery;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String[] getBitcoinPeers() {
        return bitcoinPeers;
    }

    public void setBitcoinPeers(String[] bitcoinPeers) {
        this.bitcoinPeers = bitcoinPeers;
    }

    public int getBitcoinConnections() {
        return bitcoinConnections;
    }

    public void setBitcoinConnections(int bitcoinConnections) {
        this.bitcoinConnections = bitcoinConnections;
    }

    public boolean isBitcoinDiscovery() {
        return bitcoinDiscovery;
    }

    public void setBitcoinDiscovery(boolean bitcoinDiscovery) {
        this.bitcoinDiscovery = bitcoinDiscovery;
    }
}
