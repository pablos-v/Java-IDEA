public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrom("казак"));
    }

    public static boolean isPalindrom(String str){
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) return false;
        }
        return true;
    }
}