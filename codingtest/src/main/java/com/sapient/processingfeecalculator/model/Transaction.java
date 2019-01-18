package com.sapient.processingfeecalculator.model;

import com.sapient.processingfeecalculator.constants.Priority;
import com.sapient.processingfeecalculator.constants.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction implements ITransaction {

    private String transactionId;
    private String clientId;
    private String securityId;
    private TransactionType transactionType;
    private LocalDate transactionDate;
    private BigDecimal marketValue;
    private Priority priorityFlag;

    private Transaction(TransactionBuilder transactionBuilder) {
        this.transactionId = transactionBuilder.transactionId;
        this.clientId = transactionBuilder.clientId;
        this.securityId = transactionBuilder.securityId;
        this.transactionType = transactionBuilder.transactionType;
        this.transactionDate = transactionBuilder.transactionDate;
        this.marketValue = transactionBuilder.marketValue;
        this.priorityFlag = transactionBuilder.priorityFlag;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public String getSecurityId() {
        return securityId;
    }

    @Override
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    @Override
    public BigDecimal getMarketValue() {
        return marketValue;
    }

    @Override
    public Priority getPriorityFlag() {
        return priorityFlag;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("transactionId='").append(transactionId).append('\'');
        sb.append(", clientId='").append(clientId).append('\'');
        sb.append(", securityId='").append(securityId).append('\'');
        sb.append(", transactionType=").append(transactionType);
        sb.append(", transactionDate=").append(transactionDate);
        sb.append(", marketValue=").append(marketValue);
        sb.append(", priorityFlag=").append(priorityFlag);
        sb.append('}');
        return sb.toString();
    }

    public static class TransactionBuilder {

        private String transactionId;
        private String clientId;
        private String securityId;
        private TransactionType transactionType;
        private LocalDate transactionDate;
        private BigDecimal marketValue;
        private Priority priorityFlag;

        public TransactionBuilder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public TransactionBuilder setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public TransactionBuilder setSecurityId(String securityId) {
            this.securityId = securityId;
            return this;
        }

        public TransactionBuilder setTransactionType(TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public TransactionBuilder setTransactionDate(LocalDate transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        public TransactionBuilder setMarketValue(BigDecimal marketValue) {
            this.marketValue = marketValue;
            return this;
        }

        public TransactionBuilder setPriorityFlag(Priority priorityFlag) {
            this.priorityFlag = priorityFlag;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
