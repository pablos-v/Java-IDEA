package Exeptions_Seminar_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1_solved {
    public static void main(String[] args) {

    }

    public void rwLine(Path read, Path write) throws IOException {

        try (BufferedWriter out = new BufferedWriter(Files.newBufferedWriter(write)); BufferedReader in = new BufferedReader(Files.newBufferedReader(read))){
            out.write(in.readLine());
        }
    }
}
