package Exeptions_Seminar_3;

//Создайте метод doSomething(), который бросает RuntimeException.
//Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething()

public class Task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        }catch (RuntimeException e){
            System.out.println("Mistake: " + e.getMessage());
        }
    }

    public static void doSomething() throws RuntimeException{
        int a = 10/0;
        System.out.println(a);
    }

}

