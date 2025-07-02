class Solution {
    public String makeGood(String s) {
        if (s == null || s.trim().isEmpty()) return "";

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int i = 1;

        while (i < s.length()) {
            char current = s.charAt(i);

            if (!stack.isEmpty() &&
                    (Character.toLowerCase(current) == Character.toLowerCase(stack.peek()) &&
                            current != stack.peek())) {

                
                stack.pop();
                i++;
            } else {
                stack.push(current);
                i++;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}