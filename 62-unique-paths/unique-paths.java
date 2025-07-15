class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # Initialize a 2D array with dimensions m x n
        dp = [[0] * n] * m
        
        # Fill the dp array
        for i in range(m):
            for j in range(n):
                if i == 0 or j == 0:  # First row or first column
                    dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]
        
        # Return the bottom-right corner of the grid
        return dp[m-1][n-1]

        