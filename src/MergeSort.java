import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием
public class MergeSort {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] array = {2, 1, 7, 3, 5, 10, 51};
        System.out.println(Arrays.toString(ms.sort(array)));
    }

    public int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        else {
            int mid = arr.length / 2;
            int[] arrLeft = sort(Arrays.copyOf(arr, mid));
            int[] arrRight = sort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(arrLeft, arrRight);
        }
    }

    public int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, k = 0, j = 0;
        while (i < left.length && j < right.length) {
            res[k++] = (left[i] < right[j] ? left[i++] : right[j++]);
        }
        while (j < right.length) res[k++] = ((right[j++]));
        return res;
    }
}
