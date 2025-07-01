class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < s.length(); i++) { 
            String left = s.substring(0, i);
            String right = s.substring(i);
            int val = helper(left, right);
            if (max < val) max = val;
        }

        return max;
    }

    private int helper(String str1, String str2) {
        int count0 = 0, count1 = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '0') count0++;
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == '1') count1++;
        }

        return count0 + count1;
    }
}
