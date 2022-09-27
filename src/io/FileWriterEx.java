package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String s = "Eye";
        String s1 = "!!!!!!!!!!";



        try (FileWriter writer = new FileWriter("456.txt", true)) {

            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
            writer.write(s1);
            System.out.println("DONE!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
