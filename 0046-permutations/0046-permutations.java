class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
    private void backtrack(List<List<Integer>> resultlist,ArrayList<Integer> tempList,int[] nums)
    {
        if(tempList.size()==nums.length)
        {
            resultlist.add(new ArrayList<>(tempList));
            return;
        }

        for(int number:nums)
        {
           if(tempList.contains(number))
           {
            continue;
           }
            tempList.add(number);
            backtrack(resultlist,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}