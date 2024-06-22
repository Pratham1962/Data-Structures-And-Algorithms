import java.util.*;

class Pair {
    int node;
    int time;

    public Pair(int node, int time) {
        this.node = node;
        this.time = time;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time : times) {
            adj.get(time[0]).add(new Pair(time[1], time[2]));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.time - y.time);

        dist[k] = 0;
        pq.offer(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int curNode = cur.node;
            int curTime = cur.time;

            for (Pair neighbor : adj.get(curNode)) {
                int nextNode = neighbor.node;
                int travelTime = neighbor.time;
                
                if (dist[nextNode] > curTime + travelTime) {
                    dist[nextNode] = curTime + travelTime;
                    pq.offer(new Pair(nextNode, dist[nextNode]));
                }
            }
        }

        int maxTime = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }
}
