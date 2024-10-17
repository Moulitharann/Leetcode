class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Step 2: Create an array to track the index of the largest digit from the right side
        int[] maxIndex = new int[n];
        int maxPos = n - 1; // Start with the last digit as the largest
        maxIndex[maxPos] = maxPos;

        // Traverse from right to left to populate the maxIndex array
        for (int i = n - 2; i >= 0; i--) {
            if (digits[i] > digits[maxPos]) {
                maxPos = i;
            }
            maxIndex[i] = maxPos;
        }

        // Step 3: Traverse from left to right to find the first place to swap
        for (int i = 0; i < n; i++) {
            if (digits[i] < digits[maxIndex[i]]) {
                // Swap the digits[i] with digits[maxIndex[i]]
                char temp = digits[i];
                digits[i] = digits[maxIndex[i]];
                digits[maxIndex[i]] = temp;
                break; // We are allowed to swap only once, so we stop after the first swap
            }
        }

        // Step 4: Convert the character array back to an integer and return the result
        return Integer.parseInt(new String(digits));
    }
}