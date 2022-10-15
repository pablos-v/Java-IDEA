package Exeptions_Seminar_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) {

    }

    public void rwLine(Path read, Path write) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(read);
            out = Files.newBufferedWriter(write);
            out.write(in.readLine());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {

            }

            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {

            }
        }
    }

}
