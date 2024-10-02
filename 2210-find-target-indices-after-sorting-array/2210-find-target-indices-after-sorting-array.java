class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> ar=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ar.add(i);
            }
        }
        return ar;
    }
}