import java.util.*;

class DFS {
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> traversalOrder, boolean[] visited, int node) {
        visited[node] = true;
        traversalOrder.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(adj, traversalOrder, visited, neighbor);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < 8; i++) {
            adj.add(new ArrayList<>());
        }
        
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(2).add(5);
        adj.get(3).add(1);
        adj.get(3).add(6);
        adj.get(3).add(7);
        adj.get(4).add(2);
        adj.get(5).add(2);
        adj.get(6).add(3);
        adj.get(7).add(3);
        
        ArrayList<Integer> traversalOrder = new ArrayList<>();
        boolean[] visited = new boolean[8];
        
        dfs(adj, traversalOrder, visited, 1);
        
        for (int node : traversalOrder) {
            System.out.print(node + " ");
        }
    }
}
