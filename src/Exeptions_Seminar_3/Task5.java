package Exeptions_Seminar_3;

//Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.

//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

//В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
// и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

public class Task5 {
    public static void main(String[] args) {
        String[][] arr = new String[4][2];
        try {
            arrayValidator(arr);
        }catch (Task5_exception e){
            System.out.println(e.getMessage());
            System.exit(404);
        }
        fillArray(arr);
//        arr[0][2] = "q";
        try {
            System.out.println(counter(arr));
        }catch (Task5_data_exception e){
            System.out.println("oups! " + e.getMessage());
        }
    }

    public static void fillArray(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "1";
            }
        }
    }

    public static void arrayValidator(String[][] arr) {
        if (arr.length == 4 && arr[0].length == 4) {
            System.out.println("OK!");
        } else throw new Task5_exception();
    }

    public static int counter(String[][] arr) throws Task5_data_exception{
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new Task5_data_exception(i, j);
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }

}
