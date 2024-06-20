import java.util.*;

class Pair{
    int node;
    int dist;
    
    public Pair(int node, int dist){
        this.node=node;
        this.dist=dist;
    }
}

class Main
{
    
    public static void shortestPath(ArrayList<ArrayList<Integer>> adj, int[] dist){
        
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(0,0));
        dist[0]=0;
        
        while(!queue.isEmpty()){
            int node=queue.peek().node;
            int dis=queue.peek().dist;
            queue.poll();
            
            for(int it: adj.get(node)){
                if(dist[it]>dis+1){
                    queue.offer(new Pair(it, dis+1));
                    dist[it]=dis+1;
                }
            }
        }
    }
    
	public static void main(String[] args) {
    	int v=9, m=10;
        
        int[][] edges = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); 
        
        for(int i = 0;i<v;i++) {
            adj.add(new ArrayList<>()); 
        }
        
        for(int i = 0;i<edges.length;i++) {
            adj.get(edges[i][0]).add(edges[i][1]); 
            adj.get(edges[i][1]).add(edges[i][0]); 
        }
        
        int[] dist=new int[v];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        shortestPath(adj,dist);
        
        
        for(int it: dist) System.out.print(it+ " ");
        
	}
}
