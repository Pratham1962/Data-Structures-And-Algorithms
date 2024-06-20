import java.util.*;

public class Main {
    
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] path) {
        visited[node] = 1;
        path[node] = 1;
        
        for (int it : adj.get(node)) {
            if (visited[it] == 0) {
                if (!dfs(it, adj, visited, path)) return false;
            } else if (path[it] == 1) {
                return false;
            }
        }
        
        path[node] = 0;
        return true;
    }
    
    public static void main(String[] args) {
        
        int v = 11;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(7).add(5);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        
        boolean flag = true;
        
        int[] visited = new int[v];
        int[] path = new int[v];
        
        for (int i = 1; i < v; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, adj, visited, path)) {
                    System.out.println("There exists a cycle");
                    flag = false;
                    break;
                }
            }
        }
        
        if (flag) {
            System.out.println("There does not exist a cycle");
        }
    }
}
