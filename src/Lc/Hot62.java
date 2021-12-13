package Lc;

public class Hot62 {
    private int pathNumber = 0;

    public void dfs(int row, int col, int rowend, int colend) {
        if (row >= 0 && row <= rowend && col >= 0 && col <= colend) {
            if (row == rowend && col == colend) {
                pathNumber++;
            } else if (row == rowend) {
                dfs(row,(col+1),rowend,colend);
            } else if (col == colend) {
                dfs((row + 1), col, rowend, colend);
            } else {
                dfs((row + 1), col, rowend, colend);
                dfs(row, (col + 1), rowend, colend);
            }
        }
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j]=1;
        }
        for (int k = 1; k < m; k++) {
            for (int y = 1; y < n; y++) {
                dp[k][y] = dp[k - 1][y] + dp[k][y - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
