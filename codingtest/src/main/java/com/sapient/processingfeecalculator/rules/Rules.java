package com.sapient.processingfeecalculator.rules;

import com.sapient.processingfeecalculator.model.ITransaction;
import com.sapient.processingfeecalculator.constants.Priority;
import com.sapient.processingfeecalculator.constants.TransactionType;
import com.sapient.processingfeecalculator.model.ProcessingFeeData;

import java.math.BigDecimal;
import java.util.function.Function;

public class Rules {

    //Intra day transaction rule
    public static final Function<ITransaction, ProcessingFeeData> INTRADAY_TRANSACTION = transaction -> {
        Double processingFee = 10D;
        return new ProcessingFeeData(transaction.getClientId(), transaction.getTransactionType(), transaction.getTransactionDate(), transaction.getPriorityFlag(), BigDecimal.valueOf(processingFee));
    };

    //Normal transaction rule
    public static final Function<ITransaction, ProcessingFeeData> NORMAL_TRANSACTION = transaction -> {
        Double processingFee = null;
        if (Priority.Y.equals(transaction.getPriorityFlag())) {
            processingFee = 500D;
        } else if (TransactionType.SELL.equals(transaction.getTransactionType()) || TransactionType.WITHDRAW.equals(transaction.getTransactionType())) {
            processingFee = 100D;
        } else if (TransactionType.BUY.equals(transaction.getTransactionType()) || TransactionType.DEPOSIT.equals(transaction.getTransactionType())) {
            processingFee = 50D;
        }
        return new ProcessingFeeData(transaction.getClientId(), transaction.getTransactionType(), transaction.getTransactionDate(), transaction.getPriorityFlag(), BigDecimal.valueOf(processingFee));
    };
}
