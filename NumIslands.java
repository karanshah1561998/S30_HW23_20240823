// Problem 200. Number of Islands
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class NumIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid, i, j, m, n, dirs);
                }
            }
        }
        return result;
    }
    private void dfs(char[][] grid, int i, int j, int m, int n, int[][] dirs) {
        if (i < 0 || j < 0 || i == m || j == n || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int[] dir : dirs) {
            int nr = i + dir[0];
            int nc = j + dir[1];
            dfs(grid, nr, nc, m, n, dirs);
        }
    }
}
