class Solution {
    static int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        return recursion(0,0,m,n);
    }
    public static int recursion(int i,int j,int m,int n)
    {
        if(i<0||j<0||i>=m||j>=n)
        {
            return 0;
        }
        if(dp[i][j]>0)
        {
            return dp[i][j];
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int top=recursion(i,j+1,m,n);
        int down=recursion(i+1,j,m,n);

        return dp[i][j]=top+down;
    }
}