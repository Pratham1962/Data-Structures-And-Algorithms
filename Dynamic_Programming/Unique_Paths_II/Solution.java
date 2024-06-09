class Solution {

    public int shortestPath(int m,int n, int[][] obstacleGrid, int[][] dp){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        
        if(dp[m][n]!=-1) return dp[m][n];
        if(obstacleGrid[m][n]==1) return 0;

        int up=shortestPath(m-1,n,obstacleGrid,dp);
        int left=shortestPath(m,n-1,obstacleGrid,dp);

        return dp[m][n]=up+left;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;

        int[][] dp=new int[m][n];
        
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }

        return shortestPath(m-1,n-1,obstacleGrid,dp);   
    }
}
