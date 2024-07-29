class Solution {
    public boolean isPerfectSquare(int num) {
       int val=(int) Math.sqrt(num);
       if(val*val==num)
       {
        return true;
       }
       return false;
    }
}