package com.company;

import java.io.IOException;

import static com.company.Registration.newUser;
import static com.company.WriteToFile.writeToFile;

public class Main {

    public static void main(String[] args) throws IOException {
        writeToFile(newUser());
    }
}
