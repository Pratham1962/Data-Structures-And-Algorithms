import java.util.*;

public class Main {
    
    public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[V];
        
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        int cnt = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            cnt++;
            
            for (int it : adj.get(cur)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    queue.offer(it);
                }
            }
        }
        
        return cnt == V;
    }
    
    public static void main(String[] args) {
        int V = 11;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
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
        adj.get(8).add(2);
        adj.get(9).add(10);
        adj.get(10).add(8);
        
        if (topoSort(V, adj)) {
            System.out.println("There exists no Cycle");
        } else {
            System.out.println("There exists a Cycle");
        }
    }
}
