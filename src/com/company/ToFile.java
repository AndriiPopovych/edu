package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static com.company.Registration.newUser;

public class ToFile {
    public static void writeToFile() throws IOException {
        File myFile = new File("/Users/sergeygotovsky/Desktop/file.json");
        FileOutputStream fOut = new FileOutputStream(myFile);
        OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
        myOutWriter.append(newUser());
        myOutWriter.close();
        fOut.close();
    }
}
