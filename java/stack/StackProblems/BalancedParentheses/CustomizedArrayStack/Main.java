import StackProblems.BalancedParentheses.CustomizedArrayStack.ArrayStack;

public class Main {

    public static boolean checkPairs(char open, char close){
        if (open == '{' && close == '}')
            return true;
        else if (open == '[' && close == ']')
            return true;
        else if (open == '(' && close == ')')
            return true;
        else
            return false;
    }
    public static boolean checkBalancedParentheses(String p) {
        ArrayStack stack = new ArrayStack();
        System.out.println("P " + p);
        int len = p.length();
        if (len%2.0 != 0) return false;
        System.out.println("len = " + len);
        for (int i = 0; i < len; i++) {
            char c = p.charAt(i);
            if ((c == '{') || (c == '(') || (c == '[')) {
                stack.push(c);
            } else if ((c == '}') || (c == ')') || (c == ']')){
                if ((stack.isEmpty()) || (!checkPairs(stack.getTop(), c)))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String p1 = "[({)()}]"; // False, not ordered pairs
        String p2 = "[{()}]]"; // False, length is not even
        String p3 = "[(){()}]"; // True
        String p4 = "{[[](){}]}"; // True

        System.out.println("Balanced 1? " + checkBalancedParentheses(p1));
        System.out.println("Balanced 2? " + checkBalancedParentheses(p2));
        System.out.println("Balanced 3? " + checkBalancedParentheses(p3));
        System.out.println("Balanced 4? " + checkBalancedParentheses(p4));

    }
}