class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i;j++)
            {
                if(nums[j]<=nums[j+1])
                {
                    continue;
                }
                else {
                    if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1]))
                    {
                        swap(nums,j,j+1);
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private void swap(int[] nums,int j,int k)
    {
        int temp=nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
    }
}