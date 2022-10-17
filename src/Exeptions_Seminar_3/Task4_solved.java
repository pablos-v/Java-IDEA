package Exeptions_Seminar_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task4_solved extends Exception {
    public Task4_solved() {
        super("file not exists!");
    }
}
