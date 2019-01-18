package com.sapient.processingfeecalculator.constants;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 16-01-2019 21:50
 */
public enum TransactionType {
    BUY("Buy"),
    SELL("Sell"),
    DEPOSIT("Deposit"),
    WITHDRAW("Withdraw");

    private String transactionType;

    TransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
