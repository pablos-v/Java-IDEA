class Solution {
    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) return false;
        int check1 = 0;
        int check2 = len - 1;
        for (int i = 1; i < len; i++) {
            if (arr[i] > arr[i - 1]) check1++;
            else break;
        }
        for (int i = len - 1; i > check1; i--) {
            if (arr[i] < arr[i - 1]) check2--;
            else break;
        }
        return check1 == check2 && check1 != 0 && check1 != len-1;
    }
}