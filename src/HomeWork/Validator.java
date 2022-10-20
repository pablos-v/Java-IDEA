package HomeWork;

import java.util.*;

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

    public ArrayList checkAndParseData() throws DataException {
        String[] inputString = input.split(" ");

        ArrayList parsed = new ArrayList<>();
        parsed.add(inputString[0]); // Surname
        parsed.add(inputString[1]); // Name
        parsed.add(inputString[2]); // Patronymic

        try {
            dateFormatChecker(inputString[3]);
        } catch (NumberFormatException e) {
            throw new DataException("Wrong date format!");
        }
        parsed.add(inputString[3]); // Date

        Integer number;
        try {
            number = Integer.parseInt(inputString[4]);
        } catch (NumberFormatException e) {
            throw new DataException("Wrong phone format!");
        }
        parsed.add(number); // Phone Number

        if (!Objects.equals(inputString[5], "m") && !Objects.equals(inputString[5], "f")) {
            throw new DataException("Gender must be \"m\" or \"f\"!");
        }
        parsed.add(inputString[5]); // Gender

        return parsed;
    }

    private void dateFormatChecker(String dateString) throws NumberFormatException {
        String[] date = dateString.split("\\.");
        int dd, mm, yyyy;
        try {
            dd = Integer.parseInt(date[0]);
            mm = Integer.parseInt(date[1]);
            yyyy = Integer.parseInt(date[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        Calendar cal = Calendar.getInstance();
        if (!(dd < 32 && dd > 0 && mm < 13 && mm > 0 && yyyy <= cal.get(Calendar.YEAR) && yyyy > 0)){
            throw new NumberFormatException();
        }
    }
}
