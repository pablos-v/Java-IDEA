import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /*
    You are given a string s and an array of strings words. All the strings of words are of the same length.
A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.


Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Since words.length == 2 and words[i].length == 3, the concatenated substring has to be of length 6.
The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
The output order does not matter. Returning [9,0] is fine too.
Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
Explanation: Since words.length == 4 and words[i].length == 4, the concatenated substring has to be of length 16.
There is no substring of length 16 is s that is equal to the concatenation of any permutation of words.
We return an empty array.
Example 3:

Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
Output: [6,9,12]
Explanation: Since words.length == 3 and words[i].length == 3, the concatenated substring has to be of length 9.
The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"] which is a permutation of words.
The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"] which is a permutation of words.
The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"] which is a permutation of words.
     */
    public List<Integer> findSubstring(String s, String[] words) {
        int step = words[0].length();
        int winLen = words.length * step;
        List<Integer> res = new ArrayList<>();
//        List<String> map = Arrays.asList(words);
        List<String> map = new ArrayList<>(List.of(words));
//        System.out.println(map.remove("foo"));
        for (int i = 0; i < s.length(); i += step) {
            // если в map есть подстрока (i, i+step),
            //    то удалить из мар и проверить если пустой,
            //                                  то пересоздать, и res.add(i-winLen+step)
            //                                  иначе продолжить
            //    иначе пересоздать

            if (map.remove(s.substring(i, i + step))) {
                if (map.isEmpty()) {
                    map = new ArrayList<>(List.of(words));
                    res.add(i - winLen + step);
                }
            } else map = new ArrayList<>(List.of(words));
        }
        return res;
    }


    public static void main(String[] args) {
        Solution cls = new Solution();
        System.out.println(cls.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }

}