class Solution {
    public String removeDuplicates(String s) {
        return helper(s, new StringBuilder(), 0);
    }

    private String helper(String s, StringBuilder result, int index) {
        // Base case: if we've processed the entire string, return the result
        if (index >= s.length()) {
            return result.toString();
        }

        // Process the current character
        if (result.length() > 0 && result.charAt(result.length() - 1) == s.charAt(index)) {
            // If the last character in result is the same as the current character, remove it (duplicate found)
            result.deleteCharAt(result.length() - 1);
        } else {
            // Otherwise, add the current character to the result
            result.append(s.charAt(index));
        }

        // Recursively process the next character
        return helper(s, result, index + 1);
    }
}
