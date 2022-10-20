package HomeWork;

import java.io.IOException;
import java.util.ArrayList;

public class Start {

    public static void go() {
        Input inputModule = new Input();
        String input = inputModule.consoleInput();

        Validator validator = new Validator(input);

        try {
            validator.checkLength();
        } catch (LengthException e) {
            System.out.println(e.getMessage());
            go();
        }

        ArrayList parsedInput = new ArrayList();

        try {
            parsedInput = validator.checkAndParseData();
        } catch (DataException e) {
            System.out.println(e.getMessage());
            go();
        }

        Output output = new Output(parsedInput);

        try {
            output.writeInFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
