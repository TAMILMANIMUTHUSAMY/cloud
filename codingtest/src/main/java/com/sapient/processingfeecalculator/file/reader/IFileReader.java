package com.sapient.processingfeecalculator.file.reader;

import com.sapient.processingfeecalculator.model.ITransaction;

import java.util.List;

public interface IFileReader {
    List<ITransaction> read(String filepath);
}
