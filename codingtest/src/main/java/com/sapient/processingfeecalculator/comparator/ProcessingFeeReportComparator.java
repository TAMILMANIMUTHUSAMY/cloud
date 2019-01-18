package com.sapient.processingfeecalculator.comparator;

import com.sapient.processingfeecalculator.model.ProcessingFeeData;

import java.util.Comparator;

public class ProcessingFeeReportComparator implements Comparator<ProcessingFeeData> {

    @Override
    public int compare(ProcessingFeeData o1, ProcessingFeeData o2) {
        int flag = o1.getClientId().compareTo(o2.getClientId());
        if (flag == 0)
            flag = o1.getTransactionType().name().compareTo(o2.getTransactionType().name());
        if (flag == 0)
            flag = o1.getTransactionDate().compareTo(o2.getTransactionDate());
        if (flag == 0)
            flag = o1.getPriority().name().compareTo(o2.getPriority().name());
        return flag;
    }
}
