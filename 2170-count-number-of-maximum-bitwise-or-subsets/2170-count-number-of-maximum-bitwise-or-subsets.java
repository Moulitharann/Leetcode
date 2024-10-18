class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int target=0;
        for(int num:nums)
        {
            target|=num;

                    }
        return rec(0,nums,0,target);
    }
    public int rec(int index,int[] num,int curr,int target)
    {
        if(index==num.length)
        {
            return (curr==target)?1:0;
        }
        int pair=rec(index+1,num,curr | num[index],target);
        int nopair=rec(index+1,num,curr,target);
        return pair+nopair;
    }
}