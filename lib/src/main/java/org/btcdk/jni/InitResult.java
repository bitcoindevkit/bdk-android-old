package org.btcdk.jni;

/**
 * struct InitResult {
 * mnemonicWords: String,
 * depositAddress: String,
 * }
 */
public class InitResult {

    private final String[] mnemonicWords;

    private final Address depositAddress;

    public InitResult(String mnemonicWords, Address depositAddress) {
        this.mnemonicWords = mnemonicWords != null ? mnemonicWords.split(" ") : null;
        this.depositAddress = depositAddress;
    }

    public String[] getMnemonicWords() {
        return mnemonicWords;
    }

    public Address getDepositAddress() {
        return depositAddress;
    }
}
