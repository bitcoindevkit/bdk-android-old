package org.btcdk.jni;

/**
 * pub struct BalanceAmt { pub balance: u64, pub confirmed: u64 }
 */
public class BalanceAmt {

    private final long balance;

    private final long confirmed;

    public BalanceAmt(long balance, long confirmed) {
        this.balance = balance;
        this.confirmed = confirmed;
    }

    public long getBalance() {
        return balance;
    }

    public long getConfirmed() {
        return confirmed;
    }
}
