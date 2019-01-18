package com.sapient.processingfeecalculator.service;

import com.sapient.processingfeecalculator.model.ProcessingFeeData;

import java.util.List;

public interface IProcessingFeeCalculatorService {

    List<ProcessingFeeData> generateReport(String path, String fileType);
}
