package org.btcdk.jni;

import java.util.Optional;

public class Address {

    private final String address;

    private final Network network;

    private final Optional<String> type;

    public Address(String address, int networkEnumOrdinal, Optional<String> type) {
        this.address = address;
        this.network = Network.values()[networkEnumOrdinal];
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public Network getNetwork() {
        return network;
    }

    public Optional<String> getType() {
        return type;
    }
}
