import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<List<Integer>> result = new ArrayList();

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        combinator(new ArrayList(), 1, n, k);
        System.out.println(result);
    }

    public static void combinator(ArrayList arr, int start, int n, int k) {
        if (k == 0) {
            result.add((List<Integer>) arr.clone());
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            arr.add(i);
            combinator(arr, i + 1, n, k - 1);
            arr.remove(arr.size() - 1);
        }
    }
}