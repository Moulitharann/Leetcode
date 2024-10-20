class Solution {
    public String customSortString(String order, String s) {
        // Create an array to count occurrences of characters in `s`
        int[] count = new int[26];
        
        // Count the occurrences of each character in `s`
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        String str = "";
        
        // Add characters from `order` based on their count in `s`
        for (int j = 0; j < order.length(); j++) {
            char ch = order.charAt(j);
            while (count[ch - 'a'] > 0) {
                str += ch;
                count[ch - 'a']--;
            }
        }
        
        // Add remaining characters that were not in `order`
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                str += (char)(i + 'a');
                count[i]--;
            }
        }
        
        return str;
    }
}
