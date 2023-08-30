import java.util.Stack;
public class Main {

    public static boolean arePairs(char open, char close){
        if (open == '(' && close == ')')
            return true;
        else if (open == '[' && close == ']')
            return true;
        else return open == '{' && close == '}';
    }

    public static boolean areBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        if (exp.length() % 2.0 != 0) return false;
        for (char c : exp.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (!stack.isEmpty() && arePairs(stack.peek(), c)) {
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedExpr = "([{}])";
        String unBalancedExpr = "([{[}])";
        System.out.println("Balanced? " + areBalanced(balancedExpr));
        System.out.println("Balanced? " + areBalanced(unBalancedExpr));

    }
}
