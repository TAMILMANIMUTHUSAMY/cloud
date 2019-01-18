package com.sapient.processingfeecalculator.helper;

import com.sapient.processingfeecalculator.constants.Priority;
import com.sapient.processingfeecalculator.constants.TransactionType;
import com.sapient.processingfeecalculator.model.ITransaction;
import com.sapient.processingfeecalculator.model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileReaderHelper {
    protected ITransaction createTransaction(String[] attributes) {
        return new Transaction.TransactionBuilder()
                .setTransactionId(attributes[0])
                .setClientId(attributes[1])
                .setSecurityId(attributes[2])
                .setTransactionType(TransactionType.valueOf(attributes[3].toUpperCase()))
                .setTransactionDate(LocalDate.parse(attributes[4], DateTimeFormatter.ofPattern("MM/d/uuuu")))
                .setMarketValue(new BigDecimal(attributes[5]))
                .setPriorityFlag(Priority.valueOf(attributes[6].toUpperCase()))
                .build();
    }
}
