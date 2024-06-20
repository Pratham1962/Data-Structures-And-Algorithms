class Tuple{
    int row;
    int col;
    int diff;

    public Tuple(int row,int col, int diff){
        this.row=row;
        this.col=col;
        this.diff=diff;
    }
}

class Solution {
   
    public int minimumEffortPath(int[][] heights) {

        int n=heights.length;
        int m=heights[0].length;

        PriorityQueue<Tuple> queue=new PriorityQueue<Tuple>((x,y)-> x.diff - y.diff);

        int[][] dist= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)(1e9);
            }
        }

        queue.offer(new Tuple(0,0,0));
        dist[0][0]=0;

        int[] row={-1,0,1,0};
        int[] col= {0,-1,0,1};


        while(!queue.isEmpty()){
            Tuple cur=queue.poll();
            int r=cur.row;
            int c=cur.col;
            int difference=cur.diff;

            if(r==n-1 && c==m-1) return difference;


            for(int i=0;i<4;i++){
                int nrow=r+row[i];
                int ncol=c+col[i];

                if(nrow>=0 && nrow<n && ncol<m && ncol>=0){
                    int curDiff=Math.max(difference, Math.abs(heights[r][c]-heights[nrow][ncol]));
                    if(dist[nrow][ncol]>curDiff){
                        dist[nrow][ncol]=curDiff;
                        queue.offer(new Tuple(nrow,ncol,curDiff));
                    }
                }
            }

        }

        return 0;

    }
}
