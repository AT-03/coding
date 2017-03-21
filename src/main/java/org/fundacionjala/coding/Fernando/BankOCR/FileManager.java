package org.fundacionjala.coding.Fernando.BankOCR;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * @author name of author.
 */
public class FileManager {


    /**
     * @param filename recibe a String.
     * @return ArrayList recibe a String.
     * @throws FileNotFoundException exception.
     * @throws IOException           exception.
     */
    public ArrayList<String> readFile(final String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        ArrayList<String> content = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(fr)) {
            String temp;
            while ((temp = br.readLine()) != null) {
                content.add(temp);
            }
        }
        return content;
    }

    /**
     * @param output recibe a String.
     * @throws IOException exception.
     */
    public void fileWrite(final ArrayList<String> output) throws IOException {
        File file = new File("output.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            for (String s : output) {
                bw.write(s);
                bw.newLine();
            }
        }
    }
}
