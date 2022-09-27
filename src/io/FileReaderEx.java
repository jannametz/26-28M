package io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("123.txt")) {
            int characters;
            while ((characters = fileReader.read()) != -1) {
                System.out.print((char) characters);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Done");
        }
    }
}