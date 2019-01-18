package com.sapient.processingfeecalculator.model;

import com.sapient.processingfeecalculator.constants.Priority;
import com.sapient.processingfeecalculator.constants.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProcessingFeeData {

    private String clientId;
    private TransactionType transactionType;
    private LocalDate transactionDate;
    private Priority priority;
    private BigDecimal processingFee;

    public ProcessingFeeData(String clientId, TransactionType transactionType, LocalDate transactionDate, Priority priority, BigDecimal processingFee) {
        this.clientId = clientId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.priority = priority;
        this.processingFee = processingFee;
    }

    public String getClientId() {
        return clientId;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\t").append(clientId);
        sb.append("\t").append(transactionType);
        sb.append("\t\t").append(transactionDate);
        sb.append("\t\t").append(priority);
        sb.append("\t").append(processingFee);
        return sb.toString();
    }


}
