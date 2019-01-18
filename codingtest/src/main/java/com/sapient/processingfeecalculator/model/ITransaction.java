package com.sapient.processingfeecalculator.model;

import com.sapient.processingfeecalculator.constants.Priority;
import com.sapient.processingfeecalculator.constants.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ITransaction {

    String getTransactionId();

    String getClientId();

    String getSecurityId();

    TransactionType getTransactionType();

    LocalDate getTransactionDate();

    BigDecimal getMarketValue();

    Priority getPriorityFlag();
}
