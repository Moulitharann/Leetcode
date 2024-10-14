class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++)
        {
            p.add(piles[i]);
        }
        while(0<k)
        {
            int max=p.poll();
            int value=(int) Math.floor((double)max/2);
            p.add(max-value);
            k--;
        }
        return p.stream().mapToInt(Integer::intValue).sum();
    }
}