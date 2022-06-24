import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public static String simplifyPath(String path) {
        String[] str = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String s : str
        ) {
            if (!s.isEmpty() && !s.equals("..") && !s.equals(".")) {
                stack.push(s);
            }
            if (s.equals("..") && !stack.isEmpty()) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            res.append("/");
            res.append(stack.pollLast());
        }

        return res.toString();
    }
}