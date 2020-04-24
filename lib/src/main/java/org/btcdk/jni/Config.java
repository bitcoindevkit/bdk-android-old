package org.btcdk.jni;


/**
     pub struct Config {
     pub work_dir: String,
     pub encryptedwalletkey: String,
     pub keyroot: String,
     pub lookahead: u32,
     pub birth: u64,
     pub network: Network,
     pub bitcoin_peers: Vec<SocketAddr>,
     pub bitcoin_connections: usize,
     pub bitcoin_discovery: bool,
    }
 **/
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
