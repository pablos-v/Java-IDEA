import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int N = 2; //длина числа
        int K = 3; //количество цифр
        int[] arr = new int[N];
        List res = new ArrayList();
        doIt(arr, 0, K, res);
        System.out.println(Arrays.toString(res.toArray()));
    }

    public static void doIt(int[] arr, int index, int K, List answer) {
        if (index == arr.length) {
            answer.add(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < K; i++) {
            arr[index] = i;
            doIt(arr, index + 1, K, answer);
        }
    }
}