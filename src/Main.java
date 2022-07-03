import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        print(s.updateMatrix(new int[][] {{0,0,0},{0,1,0},{1,1,1}}));
    }
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}