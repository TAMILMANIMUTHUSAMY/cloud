package com.sapient.processingfeecalculator.file.reader;

import com.sapient.processingfeecalculator.constants.FileTypeInstanceMapper;

public class FileReaderInstanceProvider {

    private static FileReaderInstanceProvider ourInstance = new FileReaderInstanceProvider();

    public static FileReaderInstanceProvider getInstance() {
        return ourInstance;
    }

    public IFileReader getReader(String fileType) {
        try {
            return FileTypeInstanceMapper.valueOf(fileType).getReader().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("We must configure the new reader for file type : " + fileType);
        }
        return null;
    }

    private FileReaderInstanceProvider() {
    }
}
