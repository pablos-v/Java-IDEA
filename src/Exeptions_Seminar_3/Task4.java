package Exeptions_Seminar_3;

//Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

//Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве
// ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке

//Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Task4 {
    //    public static void main(String[] args) {
//        System.out.println(dev(10,0));
//    }
//
//    public static int dev(int a, int b) {
//        if (b == 0) throw new Task4_solved();
//        return a / b;
//    }
//    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, null};
//        checkArray(arr);
//    }
//
//    public static void checkArray(Integer[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == null) throw new Task4_solved(i);
//        }
//    }
    public static void main(String[] args) throws Task4_solved {
        fileOpener("D:/file");
    }

    public static void fileOpener(String path) throws Task4_solved {
        Path p = Path.of(path);
        if (!Files.exists(p)) throw new Task4_solved();
    }

}
