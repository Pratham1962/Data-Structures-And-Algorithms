import java.util.*;

class Pair {
    int node;
    int dist;
    
    public Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Main {
    
    public static void shortestPath(ArrayList<ArrayList<Pair>> adj, PriorityQueue<Pair> pq, int[] dist) {
        dist[0] = 0;
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair currentPair = pq.poll();
            int node = currentPair.node;
            int dis = currentPair.dist;

            for (Pair it : adj.get(node)) {
                int neighbor = it.node;
                int weight = it.dist;

                // Relaxation step
                if (dist[neighbor] > dis + weight) {
                    dist[neighbor] = dis + weight;
                    pq.offer(new Pair(neighbor, dist[neighbor]));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] edge = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
	    
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];
            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt)); 
        }
        
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.dist - y.dist);
        
        shortestPath(adj, pq, dist);
        
        for (int it : dist) {
            System.out.print(it + " ");
        }
    }
}
