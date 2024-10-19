class Solution {
    public char findKthBit(int n, int k) {
        // Base case: the first string S1 is "0"
        if (n == 1) {
            return '0';
        }
        
        // Length of Sn is 2^n - 1
        int length = (1 << n) - 1;
        int mid = length / 2 + 1;  // Midpoint is at (2^n / 2 + 1)
        
        if (k == mid) {
            return '1';  // The middle element is always '1'
        } else if (k < mid) {
            // If k is in the left half, it follows the pattern of S(n-1)
            return findKthBit(n - 1, k);
        } else {
            // If k is in the right half, it's the inverted and reversed part of S(n-1)
            int mirroredK = length - k + 1;
            char mirroredBit = findKthBit(n - 1, mirroredK);
            return (mirroredBit == '0') ? '1' : '0';  // Invert the mirrored bit
        }
    }
}
