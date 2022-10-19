package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private String input;

    public Validator(String input) {
        this.input = input;
    }

    public void checkLength() throws LengthException {
        int normalInputLength = 6;
        int len = input.split(" ").length;
        if (len == normalInputLength) return;
        String message = "Too much data entered!";
        if (len < normalInputLength) message = "You need to enter some more data.";
        throw new LengthException(message);
    }

    public ArrayList checkData() throws DataException {
        String[] inputString = input.split(" ");
        ArrayList parsed = new ArrayList<>();
        parsed.add(inputString[0]); // Surname
        parsed.add(inputString[1]); // Name
        parsed.add(inputString[2]); // Patronymic

        if (!dateFormatChecker()) throw new DataException("Wrong date format!");
        parsed.add(inputString[3]); // Date

        Integer number;
        try {
            number = Integer.parseInt(inputString[4]);
        }catch (NumberFormatException e){
            throw new DataException("Wrong phone format!");
        }
        parsed.add(number); // Phone Number

        // TODO checker
        parsed.add(inputString[5]); // Gender
        return parsed;
    }

    private boolean dateFormatChecker() {
        // TODO
        return true;
    }

}
