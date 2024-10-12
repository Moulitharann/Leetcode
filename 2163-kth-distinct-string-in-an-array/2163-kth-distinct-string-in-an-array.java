import java.util.HashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        // HashMap to store the frequency of each string in the array
        HashMap<String, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each string in the array
        for (String s : arr) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        
        int count = 0;
        // Iterate through the array again to find the k-th distinct string
        for (String s : arr) {
            if (freqMap.get(s) == 1) {  // Only consider distinct strings
                count++;
                if (count == k) {
                    return s;  // Return the k-th distinct string
                }
            }
        }
        
        return "";  // Return empty string if no k-th distinct string is found
    }
}
