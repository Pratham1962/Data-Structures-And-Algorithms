import java.util.*;

public class Main {
    
    public static int[] kahnAlgorithm(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[V];
        
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        
        int[] ans = new int[V];
        int j = 0;
        
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {    
            int cur = queue.poll();
            ans[j++] = cur;
            
            for (int it : adj.get(cur)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    queue.offer(it);
                }
            }
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
        
        int[] topoSort = kahnAlgorithm(V, adj);
        
        for (int it : topoSort) {
            System.out.print(it + " ");
        }
    }
}
