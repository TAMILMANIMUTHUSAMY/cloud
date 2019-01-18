package com.sapient.processingfeecalculator.service;


import com.sapient.processingfeecalculator.constants.TransactionType;
import com.sapient.processingfeecalculator.model.ITransaction;
import com.sapient.processingfeecalculator.model.ProcessingFeeData;
import com.sapient.processingfeecalculator.rules.Rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessingFeeDataAggregator {

    public List<ProcessingFeeData> calculateProcessingFee(List<ITransaction> transactions) {
        Map<String, List<ITransaction>> buyandSellTxns = transactions.parallelStream()
                .filter(transaction -> TransactionType.BUY.equals(transaction.getTransactionType())
                        || TransactionType.SELL.equals(transaction.getTransactionType()))
                .collect(Collectors.groupingBy(transaction -> transaction.getClientId() + transaction.getSecurityId() + transaction.getTransactionDate(), Collectors.toList()));


        List<ITransaction> depositandWithdrawTxns = transactions.parallelStream()
                .filter(transaction -> TransactionType.DEPOSIT.equals(transaction.getTransactionType())
                        || TransactionType.WITHDRAW.equals(transaction.getTransactionType()))
                .collect(Collectors.toList());

        List<ProcessingFeeData> processingFeeData = new ArrayList<>();
        processingFeeData.addAll(calculateFee4DepositandWithdrawTxns(depositandWithdrawTxns));
        processingFeeData.addAll(calculateFee4BuyandSellTxns(buyandSellTxns));
        return processingFeeData;
    }


    private List<ProcessingFeeData> calculateFee4DepositandWithdrawTxns(List<ITransaction> normalTransactions) {
        return normalTransactions.parallelStream().map(Rules.NORMAL_TRANSACTION).collect(Collectors.toList());
    }

    private List<ProcessingFeeData> calculateFee4BuyandSellTxns(Map<String, List<ITransaction>> equityTransactionMap) {
        List<ProcessingFeeData> processingFeeReports4BuyandSell = new ArrayList<>();
        for (Map.Entry<String, List<ITransaction>> entry :  equityTransactionMap.entrySet()) {
            Map<TransactionType, List<ITransaction>> equityGroupedTxnsMap = entry.getValue().parallelStream().collect(Collectors.groupingBy(transaction -> transaction.getTransactionType(), Collectors.toList()));
            Integer nonIntradayTxnsCount = null;
            Integer intradayTxnsCount = null;
            if (equityGroupedTxnsMap.size() == 2) {//If Map has both buy and sell transactions then size will be 2, otherwise 1.
                Integer buyCount = equityGroupedTxnsMap.get(TransactionType.BUY).size();
                Integer sellCount = equityGroupedTxnsMap.get(TransactionType.SELL).size();
                if (buyCount.equals(sellCount)) {
                    //apply intra day transaction rule
                    processingFeeReports4BuyandSell.addAll(entry.getValue().parallelStream().map(Rules.INTRADAY_TRANSACTION).collect(Collectors.toList()));
                } else {
                    if (buyCount > sellCount) {
                        nonIntradayTxnsCount = buyCount - sellCount;
                        intradayTxnsCount = sellCount;
                        //calculate fee for non intra day transactions
                        processingFeeReports4BuyandSell.addAll(equityGroupedTxnsMap.get(TransactionType.BUY).parallelStream().skip(nonIntradayTxnsCount).map(Rules.NORMAL_TRANSACTION).collect(Collectors.toList()));
                    } else {
                        nonIntradayTxnsCount = sellCount - buyCount;
                        intradayTxnsCount = buyCount;
                        //calculate fee for non intra day transactions
                        processingFeeReports4BuyandSell.addAll(equityGroupedTxnsMap.get(TransactionType.SELL).parallelStream().skip(nonIntradayTxnsCount).map(Rules.NORMAL_TRANSACTION).collect(Collectors.toList()));
                    }
                    //calculate fee for intra day transactions
                    processingFeeReports4BuyandSell.addAll(equityGroupedTxnsMap.get(TransactionType.BUY).parallelStream().limit(intradayTxnsCount).map(Rules.INTRADAY_TRANSACTION).collect(Collectors.toList()));
                    processingFeeReports4BuyandSell.addAll(equityGroupedTxnsMap.get(TransactionType.SELL).parallelStream().limit(intradayTxnsCount).map(Rules.INTRADAY_TRANSACTION).collect(Collectors.toList()));
                }
            } else {
                //apply normal transaction rule
                processingFeeReports4BuyandSell.addAll(calculateFee4DepositandWithdrawTxns(entry.getValue()));
            }
        }
        return processingFeeReports4BuyandSell;
    }
}
