class Solution {

    public static int path(int[][] grid, int m, int n, int[][] dp){
        if(m==0 && n==0) return grid[0][0];

        if(m<0 || n<0) return (int) Math.pow(10,9);

        //  cant use Int_MAX.VAl because it will overflow if we add even a single digit to it.

        if(dp[m][n]!=-1) return dp[m][n];

        int left=grid[m][n]+path(grid, m, n-1,dp);
        int up=grid[m][n]+path(grid, m-1, n,dp);
        dp[m][n]= Math.min(left,up);

        return Math.min(left,up);
    }
   
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] dp =new int[m][n];

        for(int[] arr: dp) Arrays.fill(arr,-1);

        return path(grid, m-1,n-1,dp);
    }
}

