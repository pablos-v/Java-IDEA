package WorkOnFlow;

public class lectSort {
    public static void main(String[] args) {
        int[] arrInput = new int[]{9, 4, 7, 8, 6, 2, 3, 1, 5, 0};
        int[] res = VstavSort(arrInput);
        for (int r : res) {
            System.out.print(r + " ");
        }
    }

    public static int[] ViborSort(int[] arr) {
        int len = arr.length - 1;
        while (len > 1) {
            int maxIndex = 0;
            for (int i = 1; i < len; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(arr, len, maxIndex);
            len--;
        }
        return arr;
    }

    public static int[] VstavSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int indOne, int indTwo) {
        int temp = arr[indOne];
        arr[indOne] = arr[indTwo];
        arr[indTwo] = temp;
    }

}
