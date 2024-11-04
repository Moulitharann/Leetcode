class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        List<Integer> dupli=new ArrayList<>();
        for(int num:nums)
        {
            hp.put(num,hp.getOrDefault(num,0)+1);
        }
        for(int key:hp.keySet())
        {
            if(hp.get(key)>1)
            {
               dupli.add(key);
            }
        }
        return dupli;
    }
}