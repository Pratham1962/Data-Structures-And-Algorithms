class Solution {

    public static void dfs(char[][] board, int r, int c, int[][] visited,int[] row, int[] col){

        visited[r][c]=1;
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<4;i++){
            int nrow=r+row[i];
            int ncol=c+col[i];

            if(nrow<n && nrow>=0 && ncol>=0 && ncol<m){
                if(visited[nrow][ncol]!=1 && board[nrow][ncol]=='O'){
                    dfs(board,nrow,ncol,visited,row,col);
                }
            }
        }
    }

    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] visited=new int[n][m];

        int[] row={1,0,-1,0};
        int[] col={0,1,0,-1};

        for(int i=0;i<m;i++){

            if(board[0][i]=='O' && visited[0][i]!=1){
                dfs(board, 0, i, visited,row,col);
            }

            if(board[n-1][i]=='O' && visited[n-1][i]!=1){
                dfs(board, n-1, i, visited,row,col);
            }
        }

        for(int i=0;i<n;i++){

            if(board[i][0]=='O' && visited[i][0]!=1){
                dfs(board, i, 0, visited,row,col);
            }

            if(board[i][m-1]=='O' && visited[i][m-1]!=1){
                dfs(board, i, m-1, visited,row,col);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=1){
                    board[i][j]='X';
                }
            }
        }
        
    }
}
