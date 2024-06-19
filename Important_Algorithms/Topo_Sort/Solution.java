import java.util.*;

public class Main
{
    
    public static void dfs(int node, int[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        visited[node]=1;
        
        for(int it: adj.get(node)){
            if(visited[it]==0)
            dfs(it, visited, st, adj);
        }
        
        st.push(node);
    }
    
    
    public static int[] topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st=new Stack<>();
        int[] visited=new int[V];
        
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, st, adj);
            }
        }
        
        int[] ans=new int[V];
            
        for(int i=0;i<ans.length;i++){
            ans[i]=st.pop();
        }
        
        return ans;
        
        
    }
    
	public static void main(String[] args) {
		
		int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        
        
        int[] topoSort=topoSort(V,adj);
        
        for(int it:topoSort) System.out.print(it+ " ");
        
        
	}
}
