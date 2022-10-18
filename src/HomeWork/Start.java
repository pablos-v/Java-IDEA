package HomeWork;

public class Start {

    public static void go(){
        Input inputModule = new Input();
        String input = inputModule.consoleInput();

        Validator validator = new Validator(input);

        try {
            validator.checkLength();
        }catch (LengthException e){
            System.out.println(e.getMessage());
            go();
        }

        try {

        }

    }
}
