package Exeptions_Seminar_3;

import java.io.IOException;

public class Task4_solved extends RuntimeException {
    public Task4_solved(int n) {
        super("null detected at: " + n);
    }
}
