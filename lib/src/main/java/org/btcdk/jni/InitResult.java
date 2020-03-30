package org.btcdk.jni;

/**
 * struct InitResult {
 * mnemonicWords: String,
 * depositAddress: String,
 * }
 */
public class InitResult {

    private final String[] mnemonicWords;

    private final String depositAddress;

    public InitResult(String mnemonicWords, String depositAddress) {
        this.mnemonicWords = mnemonicWords != null ? mnemonicWords.split(" ") : null;
        this.depositAddress = depositAddress;
    }

    public String[] getMnemonicWords() {
        return mnemonicWords;
    }

    public String getDepositAddress() {
        return depositAddress;
    }
}
