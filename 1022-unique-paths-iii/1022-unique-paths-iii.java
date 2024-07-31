class Solution {
    private int[][] grid;
    private int m, n;
    private int totalEmpty;
    private int startX, startY, endX, endY;
    
    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.totalEmpty = 0;
        
        // Find start, end and count empty cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 2) {
                    endX = i;
                    endY = j;
                } else if (grid[i][j] == 0) {
                    totalEmpty++;
                }
            }
        }
        
        // Start the DFS from the start point
        return dfs(startX, startY, totalEmpty + 1); // +1 for the start cell
    }
    
    private int dfs(int x, int y, int remaining) {
        // Check boundaries and obstacles
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == -1) {
            return 0;
        }
        
        // Check if we are at the end point
        if (x == endX && y == endY) {
            return remaining == 0 ? 1 : 0;
        }
        
        // Mark the cell as visited
        int temp = grid[x][y];
        grid[x][y] = -1;
        
        int paths = 0;
        // Explore all four directions
        paths += dfs(x + 1, y, remaining - 1);
        paths += dfs(x - 1, y, remaining - 1);
        paths += dfs(x, y + 1, remaining - 1);
        paths += dfs(x, y - 1, remaining - 1);
        
        // Unmark the cell and return the result
        grid[x][y] = temp;
        return paths;
    }
}
