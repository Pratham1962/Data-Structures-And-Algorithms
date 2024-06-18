class Pair{
    int row;
    int col;
    int t;

    public Pair(int row, int col, int t){
        this.row=row;
        this.col=col;
        this.t=t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;

        Queue<Pair> queue=new LinkedList<>();
        int[][] visited=new int[n][m];
        int cntFresh=0;
        int maxTime=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                else if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }

        int[] row={1,0,-1,0};
        int[] col={0,1,0,-1};
        int cnt=0;

        while(!queue.isEmpty()){
            int r=queue.peek().row;
            int c=queue.peek().col;
            int time=queue.peek().t;

            maxTime=Math.max(maxTime,time);
            queue.poll();

            for(int i=0;i<4;i++){
                int nrow=r+row[i];
                int ncol=c+col[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    if(grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                        queue.offer(new Pair (nrow,ncol,time+1));
                        visited[nrow][ncol]=2;
                        cnt++;
                    }
                }
            }
        }
