import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        HeapSort hs = new HeapSort();
        hs.heapSort();
        System.out.println(Arrays.toString(arr));
    }

    static int[] arr = {1, 5, 3, 4, 7, 2, 0};

    public void heapSort() {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            sort(i, arr.length);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(0, i);
            sort(0, i);
        }
    }

    public void sort(int root, int size) {

        int leftKidIndex = root * 2 + 1;
        int rightKidIndex = root * 2 + 2;
        int maxIndex = root;

        if (leftKidIndex < size && arr[leftKidIndex] > arr[maxIndex]) {
            maxIndex = leftKidIndex;
        }
        if (rightKidIndex < size && arr[rightKidIndex] > arr[maxIndex]) {
            maxIndex = rightKidIndex;
        }
        if (maxIndex == root) return;
        swap(maxIndex, root);
        sort(maxIndex, size);

    }

    private void swap(int max, int root) {
        int temp = arr[max];
        arr[max] = arr[root];
        arr[root] = temp;
    }

}

