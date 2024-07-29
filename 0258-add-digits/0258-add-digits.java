class Solution {
    public int addDigits(int num) {
        int res=num;
        while(res>9)
        {
           res=Check(res);
        }
        return res;
    }
    private static int Check(int n)
    {
        int sum=0;
        while(n>0)
        {
            int remain=n%10;
            sum+=remain;
            n/=10;
        }
        return sum;
    }
}