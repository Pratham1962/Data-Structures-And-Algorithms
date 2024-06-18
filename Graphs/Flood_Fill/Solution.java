class Solution {

    public static void dfs(int[][] image, int sr, int sc, int element, int n, int m, int[] row, int[] col, int color){
        
        image[sr][sc]=color;

        for(int i=0;i<4;i++){
            int nrow=sr+row[i];
            int ncol=sc+col[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                if(image[nrow][ncol]==element && image[nrow][ncol]!=color){
                    dfs(image,nrow,ncol,element,n,m,row,col,color);
                }
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        

        int n=image.length;
        int m=image[0].length;
        int[] row={1,0,-1,0};
        int[] col={0,1,0,-1};
        int ini=image[sr][sc];

        dfs(image, sr, sc, ini, n,m,row,col,color);

        return image;

    }
}
