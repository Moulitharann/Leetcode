class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            
            int val=(26-(s.charAt(i)-'a'))*(i+1);
            sum+=val;
        }
        return sum;
    }
}