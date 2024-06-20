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
    public static void shortestPath(ArrayList < ArrayList < Pair >> adj , TreeSet<Pair> set, int[] dist){
        
        dist[0]=0;
        set.add(new Pair(0,0));
        
        while(!set.isEmpty()){
            Pair cur=set.pollFirst();
            int node=cur.node;
            int dis=cur.dist;
            
            
            for(Pair it:adj.get(node)){
                
                if(dist[it.node]>dis+it.dist){
                    if(dist[it.node]!=Integer.MAX_VALUE) set.remove(new Pair(it.node,dist[it.node]));
                    dist[it.node]=dis+it.dist;
                    set.add(new Pair(it.node,dist[it.node]));
                }
            }
        }
    }
    
	public static void main(String[] args) {
		
		int n = 6, m = 7;
        int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
	    
	    ArrayList < ArrayList < Pair >> adj = new ArrayList < > ();
        
        for (int i = 0; i < n; i++) {
            ArrayList < Pair > temp = new ArrayList < Pair > ();
            adj.add(temp);
        }

        for (int i = 0; i < m; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];
            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }
        
        int[] dist=new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        TreeSet<Pair> set = new TreeSet<Pair>((x,y) -> x.dist - y.dist);
        
        shortestPath(adj,set,dist);
        
        for(int it: dist) System.out.print(it+ " ");
        
	}
}
