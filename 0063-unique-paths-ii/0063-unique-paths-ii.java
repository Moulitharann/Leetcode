class Solution {
    static int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        dp=new int[m][n];
        return recursion(0,0,m,n,obstacleGrid);
    }
    private static int recursion(int i,int j,int m,int n,int[][] obstaclesGrid)
    {
         if(i<0||j<0||i>=m||j>=n||obstaclesGrid[i][j]==1)
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
        int top=recursion(i,j+1,m,n,obstaclesGrid);
        int down=recursion(i+1,j,m,n,obstaclesGrid);

        return dp[i][j]=top+down;
    }
}