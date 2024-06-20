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
    
    public static void dfs(int node, int[] visited, Stack<Integer> st, ArrayList<ArrayList<Pair>> adj){
        
        visited[node]=1;
        
        for(Pair it: adj.get(node)){
            if(visited[it.node]==0)
            dfs(it.node, visited, st, adj);
        }
        
        st.push(node);
    }
    
    public static void shortestPath(ArrayList < ArrayList < Pair >> adj, Stack<Integer> st, int[] dist ){
        
        dist[0]=0;
        
        while(!st.isEmpty()){
            
            int node=st.pop();
            
            for(Pair it: adj.get(node)){
                if(dist[node]+it.dist<dist[it.node]){
                    dist[it.node]=dist[node]+it.dist;
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
        }
        
        Stack<Integer> st=new Stack<>();
        
        int[] visited=new int[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, st, adj);
            }
        }
        
        
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        shortestPath(adj, st,dist);
        
        for(int it: dist) System.out.print(it+" ");
        
	}
}
