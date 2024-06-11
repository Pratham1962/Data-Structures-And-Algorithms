class Solution {
    
    public static int length(String text1, String text2, int i, int j, int[][] dp){

        if(i==-1 || j==-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(text1.charAt(i)==text2.charAt(j)) return 1+length(text1,text2, i-1,j-1, dp);

        return dp[i][j]=Math.max(0+length(text1,text2, i-1,j, dp),0+length(text1,text2, i,j-1, dp));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int i=text1.length();
        int j=text2.length();

        int[][] dp=new int[i][j];

        for(int[] arr: dp) Arrays.fill(arr,-1);

        return length(text1,text2,i-1,j-1,dp);
    }
}
