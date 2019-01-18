package com.sapient.processingfeecalculator;

import com.sapient.processingfeecalculator.constants.FileType;
import com.sapient.processingfeecalculator.service.ProcessingFeeCalculatorService;

public class App {
    public static void main(String[] args) {
        ProcessingFeeCalculatorService processingFeeCalculatorService = new ProcessingFeeCalculatorService();
        //Assuming that file path and file data are valid.
        processingFeeCalculatorService.generateReport("D:\\spring-cloud\\cloud\\codingtest\\src\\main\\resources\\sample_test_data.csv",
                FileType.CSV).forEach(System.out::println);
    }
}
