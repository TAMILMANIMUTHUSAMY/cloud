package com.sapient.processingfeecalculator.constants;

import com.sapient.processingfeecalculator.file.reader.CsvFileReader;
import com.sapient.processingfeecalculator.file.reader.IFileReader;

public enum FileTypeInstanceMapper {

    CSV(CsvFileReader.class);

    /*XLS(XlsFileReader.class),
    XML(XmlFileReader.class),
    TEXT(TestFileReader.class);*/

    private Class<?> fileReader;

    FileTypeInstanceMapper(Class<?> fileReader) {
        this.fileReader = fileReader;
    }

    public Class<IFileReader> getReader() {
        return (Class<IFileReader>) fileReader;
    }
}
