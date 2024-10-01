class Solution {
    public int scoreOfString(String s) {
        int arr[]=new int[s.length()];
         for(int i=0;i<s.length();i++)
         {
            int val=s.charAt(i);
             arr[i]=val;
         }
         int res=0;
         for(int i=0;i<arr.length-1;i++)
         {
               res+=Math.abs(arr[i]-arr[i+1]);
         }
         return res;
    }
}