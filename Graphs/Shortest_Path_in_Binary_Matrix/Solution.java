class Pair{
    int row;
    int col;
    int steps;

    public Pair(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]!=0) return -1;
        if (n == 1 && m == 1) return 1;
        
        int[][] visited=new int[n][m];
        Queue<Pair> queue=new LinkedList<>();

        queue.offer(new Pair(0,0,1));
        visited[0][0]=1;

        int[] row={1,1,0,-1,-1,-1,0,1};
        int[] col={0,1,1,1,0,-1,-1,-1};


        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            int r=cur.row;
            int c=cur.col;
            int step=cur.steps;
            if(r==n-1 && c==n-1 && grid[r][c]==0) return step;

            for(int i=0;i<8;i++){

                int nrow=r+row[i];
                int ncol=c+col[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    if(visited[nrow][ncol]==0 && grid[nrow][ncol]==0){
                        queue.offer(new Pair(nrow,ncol,step+1));
                        visited[nrow][ncol]=1;
                    }
                }
            }
        }

        return -1;
    }
}
