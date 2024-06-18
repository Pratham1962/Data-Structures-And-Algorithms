class Pair{
    int row;
    int col;
    int val;

    public Pair(int row, int col, int val){
        this.row=row;
        this.col=col;
        this.val=val;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair> queue=new LinkedList<>();
        int[][] visited=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    queue.offer(new Pair(i,j,0));
                    visited[i][j]=1;
                }
            }
        }

        int[] row={1,0,-1,0};
        int[] col={0,1,0,-1};

        while(!queue.isEmpty()){
            int r=queue.peek().row;
            int c=queue.peek().col;
            int val=queue.peek().val;
            queue.poll();
            
            mat[r][c]=val;

            for(int i=0;i<4;i++){
                int nrow=r+row[i];
                int ncol=c+col[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    if(visited[nrow][ncol]!=1){
                        visited[nrow][ncol]=1;
                        queue.offer(new Pair(nrow,ncol,val+1));
                    }
                }
            }
        }

        return mat;

    }
}
