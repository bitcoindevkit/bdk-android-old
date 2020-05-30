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
