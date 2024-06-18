class Solution {

    public static void dfs(int[][] board, int r, int c, int[][] visited,int[] row, int[] col){

        visited[r][c]=1;
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<4;i++){
            int nrow=r+row[i];
            int ncol=c+col[i];

            if(nrow<n && nrow>=0 && ncol>=0 && ncol<m){
                if(visited[nrow][ncol]!=1 && board[nrow][ncol]==1){
                    dfs(board,nrow,ncol,visited,row,col);
                }
            }
        }
    }

    public int numEnclaves(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] visited=new int[n][m];

        int[] row={1,0,-1,0};
        int[] col={0,1,0,-1};

        for(int i=0;i<m;i++){

            if(board[0][i]==1 && visited[0][i]!=1){
                dfs(board, 0, i, visited,row,col);
            }

            if(board[n-1][i]==1 && visited[n-1][i]!=1){
                dfs(board, n-1, i, visited,row,col);
            }
        }

        for(int i=0;i<n;i++){

            if(board[i][0]==1 && visited[i][0]!=1){
                dfs(board, i, 0, visited,row,col);
            }

            if(board[i][m-1]==1 && visited[i][m-1]!=1){
                dfs(board, i, m-1, visited,row,col);
            }
        }

        int cnt=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==1 &&visited[i][j]!=1){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
