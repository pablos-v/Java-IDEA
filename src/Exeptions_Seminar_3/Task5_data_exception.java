package Exeptions_Seminar_3;

public class Task5_data_exception extends NumberFormatException {

    public Task5_data_exception(int a, int b) {
        super("not a number in arr[" + a + "]" + "[" + b + "]");
    }
}
