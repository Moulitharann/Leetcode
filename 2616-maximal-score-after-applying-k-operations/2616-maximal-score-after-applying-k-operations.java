import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long score = 0;

        for (int num : nums) {
            maxHeap.add(num);
        }

        
        while (k > 0) {
            int max = maxHeap.poll(); 
            score += max;
            int l1 = (int) Math.ceil((double) max / 3);
            maxHeap.add(l1);
            k--;
        }

        return score;
    }
}
