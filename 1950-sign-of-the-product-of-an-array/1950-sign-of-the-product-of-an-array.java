class Solution {
    public int arraySign(int[] nums) {
        int sum=1;
        for(int num:nums)
        {
            sum*=num;
        }
        if(sum<0)
        {
            return -1;
        }
        else if(sum>0)
        {
            return 1;
        }
        return 0;
    }
}