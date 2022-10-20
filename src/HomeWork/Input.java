package HomeWork;

import java.util.Scanner;

public class Input {

    public String consoleInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input data in format: Surname Name Patronymic dateOfBirth(dd.mm.yyyy) phoneNumber gender");
        return in.nextLine();
    }


}
