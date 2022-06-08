public class Main {
    public static void main(String[] args) {
        System.out.println(compressor("aaaabbbcdd"));
        System.out.println("a4b3cd2");
    }

    static String compressor(String str) {
        char ch = str.charAt(0);
        int count = 1;
        String ans = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            } else {
                ans = count == 1 ? ans + Character.toString(ch) : ans + Character.toString(ch) + count;
                ch = str.charAt(i);
                count = 1;
            }
        }
        ans = count == 1 ? ans + Character.toString(ch) : ans + Character.toString(ch) + count;
        return ans;
    }
}