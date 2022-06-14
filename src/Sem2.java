import java.util.ArrayList;

//Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
//заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
public class Sem2 {
    // input
    static String input = "2? + ?5 = 69";
    // indexes of '?' chars
    static ArrayList<Integer> indexes = new ArrayList<>();

    public static void main(String[] args) {
        // counting indexes
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '?') indexes.add(i);
        }
        // searching solution
        combineRec(new int[indexes.toArray().length], 0);
        System.out.println("No solution");
    }

    public static void combineRec(int[] comb, int index) {
        if (index == comb.length) {
            // forming combination
            char[] example = input.toCharArray();
            for (int i = 0; i < comb.length; i++) {
                example[indexes.get(i)] = Character.forDigit(comb[i], 10);
            }
            // check if match
            if (check(example)) {
                System.out.println(new String(example));
                // можно ли так жёстко выходить? если программа работает - то наверное можно)
                System.exit(1);
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            comb[index] = i;
            combineRec(comb, index + 1);
        }
    }

    static boolean check(char[] ch) {
        // parsing
        String s = new String(ch);
        String[] arr = s.split(" ");
        ArrayList<String> str = new ArrayList<>();
        str.add(arr[0]);
        str.add(arr[2]);
        str.add(arr[4]);

        int a = Integer.parseInt(str.get(0));
        int b = Integer.parseInt(str.get(1));
        int c = Integer.parseInt(str.get(2));
        return a + b == c;
    }
}