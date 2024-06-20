class Tuple {
    int stop, node, dist;
    Tuple(int stop, int node, int dist) {
        this.stop = stop;
        this.node = node;
        this.dist = dist;
    }
}

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }

        int m = flights.length;

        for (int i = 0; i < m; i++) {
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(0, src, 0));

        while(!queue.isEmpty()){
            Tuple cur = queue.poll();
            int stops = cur.stop;
            int curNode = cur.node;
            int dis = cur.dist;

            if (stops > k) continue;

            for (Pair it : adj.get(curNode)) {
                if (dist[it.first] > it.second + dis) {
                    dist[it.first] = it.second + dis;
                    queue.offer(new Tuple(stops + 1, it.first, dist[it.first]));
                }
            }
        }


        if (dist[dst] != Integer.MAX_VALUE) return dist[dst];
        return -1;
    }
}
