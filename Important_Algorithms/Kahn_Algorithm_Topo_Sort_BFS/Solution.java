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
        
