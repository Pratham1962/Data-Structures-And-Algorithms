import java.util.*;

class Pair {
    long node;
    long time;

    public Pair(long node, long time) {
        this.node = node;
        this.time = time;
    }
}

class Solution {
    public int countPaths(int n, int[][] times) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time : times) {
            adj.get(time[0]).add(new Pair(time[1], time[2]));
            adj.get(time[1]).add(new Pair(time[0], time[2]));
        }

        long[] dist = new long[n];
        int[] ways=new int[n];

        Arrays.fill(dist, Long.MAX_VALUE/2);
        dist[0] = 0;
        ways[0]=1;

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> Long.compare(x.time, y.time));
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            long curNode = cur.node;
            long curTime = cur.time;

            for (Pair neighbor : adj.get((int)curNode)) {
                long nextNode = neighbor.node;
                long travelTime = neighbor.time;

                if (dist[(int)nextNode] > curTime + travelTime) {
                    dist[(int)nextNode] = curTime + travelTime;
                    ways[(int)nextNode] = ways[(int)curNode]; 
                    pq.offer(new Pair(nextNode, dist[(int)nextNode]));
                } else if (dist[(int)nextNode] == curTime + travelTime) {
                   ways[(int) nextNode] = (ways[(int) nextNode] + ways[(int) curNode]) % ((int) 1e9 + 7);
                }
            }
        }

        return ways[n - 1] % ((int) 1e9 + 7);
    }
}
