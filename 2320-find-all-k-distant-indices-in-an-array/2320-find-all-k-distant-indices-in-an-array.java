class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
       ArrayList<Integer> ar=new ArrayList<>();

       int higher=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]== key){
             int lower=Math.max(higher,i-k);
               higher=Math.min(nums.length-1,i+k)+1;

              for(int j=lower;j<higher;j++){
                ar.add(j);
              }
        }
       } 
       return ar;
    }
}