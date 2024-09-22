class Solution {
    public int findKthNumber(int n, int k) {
        int cur = 1;
        k--; 
        
        while (k > 0) {
            int steps = countSteps(n, cur, cur + 1); 
            if (steps <= k) {
               
                cur++;
                k -= steps;
            } else {
               
                cur *= 10;
                k--;
            }
        }
        return cur;
    }

    private int countSteps(int n, long cur, long next) {
        int steps = 0;
        while (cur <= n) {
            steps += Math.min(n + 1, next) - cur;
            cur *= 10;
            next *= 10;
        }
        return steps;
    }
}
