package com.sapient.processingfeecalculator.service;

import com.sapient.processingfeecalculator.comparator.ProcessingFeeReportComparator;
import com.sapient.processingfeecalculator.file.reader.FileReaderInstanceProvider;
import com.sapient.processingfeecalculator.file.reader.IFileReader;
import com.sapient.processingfeecalculator.model.ITransaction;
import com.sapient.processingfeecalculator.model.ProcessingFeeData;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessingFeeCalculatorService implements IProcessingFeeCalculatorService {

    @Override
    public List<ProcessingFeeData> generateReport(String path, String fileType) {

        IFileReader fileReader = FileReaderInstanceProvider.getInstance().getReader(fileType);
        List<ITransaction> transactionList = fileReader.read(path);

        List<ProcessingFeeData> processingFeeDatas =  new ProcessingFeeDataAggregator().calculateProcessingFee(transactionList);
        Map<String, List<ProcessingFeeData>> stringListMap =  processingFeeDatas.parallelStream().collect(Collectors.groupingBy(o -> o.getClientId()+o.getTransactionType().name()+o.getTransactionDate()+o.getPriority()));

        return stringListMap.entrySet().parallelStream().map(entry -> {
            BigDecimal totalProcessingFee = BigDecimal.ZERO;
            for (ProcessingFeeData processingFeeData : entry.getValue()) {
                totalProcessingFee = totalProcessingFee.add(processingFeeData.getProcessingFee());
            }
            ProcessingFeeData processingFeeData = entry.getValue().get(0);
            processingFeeData.setProcessingFee(totalProcessingFee);
            return processingFeeData;
        }).sorted(new ProcessingFeeReportComparator()).collect(Collectors.toList());
    }
}
