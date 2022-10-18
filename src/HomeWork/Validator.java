package HomeWork;

public class Validator {

    private String input;

    public Validator(String input) {
        this.input = input;
    }

    public void checkLength() throws LengthException {
        int normalInputLength = 6;
        int len = input.split(" ").length;
        String message = "Too much data entered!";
        if (len == normalInputLength) return;
        if (len < normalInputLength) message = "You need to enter some more data.";
        throw new LengthException(message);
    }

}
