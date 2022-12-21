package Homework;

public class HeapSort {
    public static void main(String[] args) {
        int[] arrInput = new int[]{9, 4, 1, 5, 3, 0, 7};
        printer(sorter(arrInput));

    }

    private static void printer(int[] res) {
        for (int r : res) {
            System.out.print(r + " ");
        }
    }

    private static int[] sorter(int[] arrInput) {
        int last = arrInput.length - 1;
        int end = last / 2 - 1;
        for (int i = 0; i < last; i++) {
            pyramid(arrInput, end);
            swap(arrInput, arrInput[0], arrInput[last--]);
        }
        return arrInput;
    }

    public static void pyramid(int[] arr, int end) {

        for (int i = 0; i < end; i++) {
            checker(arr, arr[i], arr[i * 2 + 1], arr[i * 2 + 2]);
        }
    }

    public static void checker(int[] arr, int a, int b, int c) {
        if (a < b) swap(arr, a, b);
        if (a < c) swap(arr, a, c);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
