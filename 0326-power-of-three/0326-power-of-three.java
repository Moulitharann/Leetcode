class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<25;i++)
        {
            if(Math.pow(3,i)==n)
            {
                return true;
            }
        }
        return false;
    }
}