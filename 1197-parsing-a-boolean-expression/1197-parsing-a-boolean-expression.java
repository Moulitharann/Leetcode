import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> oper = new Stack<>();
        Stack<Character> expr = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == '&' || ch == '|' || ch == '!') {
                oper.push(ch);
            } else if (ch == 't' || ch == 'f' || ch == '(') {
                expr.push(ch);
            } else if (ch == ')') {
                evaluate(oper, expr);
            }
        }
        return expr.peek() == 't';
    }

    private static void evaluate(Stack<Character> oper, Stack<Character> expr) {
        char op = oper.pop();
        boolean result = (op == '&') ? true : false;
        Stack<Character> temp = new Stack<>();

        // Collect all the boolean values until '('
        while (expr.peek() != '(') {
            temp.push(expr.pop());
        }
        expr.pop(); // Remove '('

        if (op == '|') {
            while (!temp.isEmpty()) {
                result |= (temp.pop() == 't');
            }
        } else if (op == '&') {
            while (!temp.isEmpty()) {
                result &= (temp.pop() == 't');
            }
        } else if (op == '!') {
            result = !(temp.pop() == 't');
        }

        // Push the result back as 't' or 'f'
        expr.push(result ? 't' : 'f');
    }
}
