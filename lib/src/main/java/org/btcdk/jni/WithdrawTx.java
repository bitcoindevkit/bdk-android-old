package org.btcdk.jni;

public class WithdrawTx {

    private String txid;

    private long fee;

    public WithdrawTx(String txid, long fee) {
        this.txid = txid;
        this.fee = fee;
    }

    public String getTxid() {
        return txid;
    }

    public long getFee() {
        return fee;
    }
}
