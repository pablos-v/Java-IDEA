package HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Output {
    ArrayList input;

    public Output(ArrayList input) {
        this.input = input;
    }

    public void writeInFile() throws IOException {
        Path path = Path.of((String) input.get(0));
        Files.writeString(
                path, input + System.lineSeparator(),
                CREATE, APPEND
        );
    }
}
