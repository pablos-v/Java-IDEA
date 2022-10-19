package HomeWork;

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
            parsedInput = validator.checkData();
        } catch (DataException e) {
            System.out.println(e.getMessage());
            go();
        }

        Output output = new Output(parsedInput);

        output.writeInFile(); //TODO При возникновении проблемы с чтением-записью в файл, исключение должно
        // быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

    }
}
