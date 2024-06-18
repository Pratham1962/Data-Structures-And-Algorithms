import java.util.*;

class BFS {
    
    
    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> traversalOrder = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        
        
        queue.offer(1);
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            traversalOrder.add(currentNode);
            
          
            for (int neighbor : adj.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        
        return traversalOrder;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
       
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }
        
      
        adj.get(1).add(2);
        adj.get(1).add(5);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(1);
        adj.get(5).add(2);
        adj.get(5).add(3);
        adj.get(5).add(4);
        
        
        ArrayList<Integer> result = bfs(6, adj);
        
        
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
