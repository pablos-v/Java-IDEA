package Exeptions_Seminar_3;

//Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
//Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources и после выхода из блока,
// он не давал больше возможности выполнять метод add(), а при попытке это сделать бросал бы исключение.
// Подумайте над типом исключения.

public class Task3 {
    public static void main(String[] args) throws Exception {

        try (Task3_counter counter = new Task3_counter()){
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getI());
        }
        try (Task3_counter counter = new Task3_counter()) {
            counter.add();
        }catch (RuntimeException e){
            System.out.println("Error!");
        }

    }

}
