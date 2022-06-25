import java.util.*;

public class Main {
    static Map<String, Integer> priorityMap = Map.of("+", 1, "-", 1, "*", 2, "/", 2, "(", 0);

    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.postfixFrom("2 * ( 3 + 5 ) * 4")); // 2 3 5 + * 4 *
        System.out.println(solution.evalRPN(solution.postfixFrom("2 * ( 3 + 5 ) * 4").split(" ")));
    }

    public String postfixFrom(String infixExp) {
        StringBuilder sb = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();
        String[] tokens = infixExp.split(" ");
        for (String token : tokens) {
            if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else if (!priorityMap.containsKey(token)) {
                sb.append(token).append(" ");
            } else {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && priorityMap.get(stack.peek()) >= priorityMap.get(token)) {
                        sb.append(stack.pop()).append(" ");
                    }
                    stack.push(token);
                }else {
                    stack.push(token);
                }
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop()).append(" ");
        return sb.toString().trim();
    }
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        int result = 0;
        Stack<Integer> nums = new Stack<>();
        Set<String> operations = Set.of("+", "-", "*", "/");
        for (String token : tokens) {
            if (operations.contains(token)) {
                int second = nums.pop();
                int first = nums.pop();
                nums.add(perform(token, first, second));
                result = nums.peek();
            } else {
                nums.add(Integer.parseInt(token));
            }
        }
        return result;
    }

    int perform(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new RuntimeException();
        }
    }

}