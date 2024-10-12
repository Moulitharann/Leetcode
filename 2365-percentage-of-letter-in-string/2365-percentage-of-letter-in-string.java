class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        
        // Loop to count occurrences of the letter in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        
        // Calculate percentage and return it as an integer
        return (count * 100) / s.length();
    }
}
    