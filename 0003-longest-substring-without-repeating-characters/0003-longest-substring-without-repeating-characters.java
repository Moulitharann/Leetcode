import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> s = new HashSet<>();
        int maxLength = 0;
        int j = 0;  // left pointer
        
        for (int i = 0; i < str.length(); i++) {  // right pointer
            while (s.contains(str.charAt(i))) {
                s.remove(str.charAt(j));
                j++;
            }
            s.add(str.charAt(i));
            maxLength = Math.max(maxLength, i - j + 1);
        }
        
        return maxLength;
    }
}
