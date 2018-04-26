package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteToFile {

    public static void writeToFile(String jsonForWrite) throws IOException {
        File myFile = new File("/Users/sergeygotovsky/Desktop/file.json");
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(jsonForWrite);
        myOutWriter.close();
        fOut.close();
    }
}
