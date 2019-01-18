package com.sapient.processingfeecalculator.file.reader;

import com.sapient.processingfeecalculator.helper.FileReaderHelper;
import com.sapient.processingfeecalculator.model.ITransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader extends FileReaderHelper implements IFileReader {

    @Override
    public List<ITransaction> read(String filePath) {
        List<ITransaction> transactions = new ArrayList<>();
        Path pathToFile = Paths.get(filePath);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                transactions.add(createTransaction(attributes));
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return transactions;
    }

}
