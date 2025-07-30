class Solution {
    public int longestSubarray(int[] nums) {
        int maxvalue=0,current=0,ans=0;
        for(int num:nums){
            if(maxvalue<num){
                maxvalue=num;
                current=ans=0;
            }
            if(maxvalue==num){
                current++;
            }
            else current=0;
        ans=Math.max(ans,current);
        }
        return ans;
    }

}