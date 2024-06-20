import java.util.*;

public class Main
{
    
    
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int prev){
        visited[node]=1;
        
        for(int it: adj.get(node)){
            if(prev!=it && visited[it]==0) {
                if(!dfs(it, adj,visited,node)) return false;
            }
            
            else if(prev!=it && visited[it]==1) return false;
        }
        
        
        return true;
    }
    
	public static void main(String[] args) {
		
		int v=4;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
        adj.get(1).add(3);
        
        int[] visited=new int[v];
        
        if(dfs(1,adj,visited,-1)) System.out.print("There does not exist a cycle");
        else System.out.print("There exists a cycle");
        
	}
}
