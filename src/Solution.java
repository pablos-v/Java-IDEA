class Solution {
    static StringBuilder res = new StringBuilder();

    public static String mergeAlternately(String word1, String word2) {
        String shortest = word1;
        String longest = word2;
        if (word1.length() > word2.length()) {
            shortest = word2;
            longest = word1;
        }
        for (int i = 0; i < shortest.length(); i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if (word1.length() == word2.length()) return res.toString();
        for (int i = shortest.length(); i < longest.length(); i++) {
            res.append(longest.charAt(i));
        }
        return res.toString();
    }
}