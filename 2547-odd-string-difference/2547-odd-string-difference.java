import java.util.ArrayList;

class Solution {
    public String oddString(String[] words) {
         HashMap<String, Integer> patternCount = new HashMap<>();
        HashMap<String, String> patternToWord = new HashMap<>();
        
        // Generate difference patterns for each word and store them
        for (String word : words) {
            String pattern = Helper(word);
            patternCount.put(pattern, patternCount.getOrDefault(pattern, 0) + 1);
            patternToWord.put(pattern, word);
        }

        // Find the pattern that occurs only once
        for (String pattern : patternCount.keySet()) {
            if (patternCount.get(pattern) == 1) {
                return patternToWord.get(pattern); // Return the corresponding word
            }
        }
        
        return ""; // Default return if no unique pattern is found
    }


    private static String Helper(String str) {
        StringBuilder value = new StringBuilder(); // Use StringBuilder for better performance
        for (int i = 0; i < str.length() - 1; i++) {
            // Calculate difference between consecutive characters
            int difference = (int) str.charAt(i + 1) - (int) str.charAt(i);
            value.append(difference).append(","); // Append difference
        }
        // Remove the trailing comma
        if (value.length() > 0) {
            value.setLength(value.length() - 1); // Remove the last comma
        }
        return value.toString(); // Return the difference pattern as a string
    }

}
