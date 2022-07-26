package MyPlanner;

import java.util.Date;
import java.util.Scanner;

public class ConsoleInput {
    // input: task, deadLine, Name
    // добавить dateTime return ArrayList<String>

    public void input(){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter task, date, name:");
        String input = console.nextLine();

        Date dateTime = new Date();
    }
}
