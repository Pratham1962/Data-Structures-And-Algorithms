class Solution {
    
    public static int total(List<List<Integer>> triangle, int i, int j, int n, int[][] dp){

        if(dp[i][j]!=-1) return dp[i][j];

        if(i==n-1) return triangle.get(i).get(j);
        
        int down= triangle.get(i).get(j)+total(triangle,i+1,j,n,dp);
        int diagonal= triangle.get(i).get(j)+total(triangle,i+1,j+1,n,dp);

        return dp[i][j]=Math.min(down,diagonal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int n=triangle.size();
        int[][] dp=new int[n][n];

        for(int[] arr:dp) Arrays.fill(arr,-1);
        return total(triangle,0,0,n,dp);        
    }
}
