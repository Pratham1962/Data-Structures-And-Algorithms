import java.util.*;

class Pair {
    int node;
    int dist;

    public Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Tuple {
    int node;
    int parent;
    int dist;

    public Tuple(int node, int parent, int dist) {
        this.node = node;
        this.parent = parent;
        this.dist = dist;
    }
}

class Pair1 {
    int node;
    int parent;

    public Pair1(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

public class Main {

    public static int primsAlgorithm(ArrayList<ArrayList<Pair>> adj, int V, ArrayList<Pair1> list) {
        int[] visited = new int[V];
        PriorityQueue<Tuple> pq = new PriorityQueue<>((x, y) -> x.dist - y.dist);
        pq.offer(new Tuple(0, -1, 0));
        int sum = 0;

        while (!pq.isEmpty()) {
            Tuple cur = pq.poll();
            int curNode = cur.node;
            int curParent = cur.parent;
            int dis = cur.dist;

            if (visited[curNode] == 1) continue;
            visited[curNode] = 1;

            if (curParent != -1) list.add(new Pair1(curParent, curNode));

            sum += dis;

            for (Pair it : adj.get(curNode)) {
                int a = it.node;
                int b = it.dist;

                if (visited[a] == 0) pq.offer(new Tuple(a, curNode, b));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int[][] edges = {{0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}};

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Pair>());
        }

       
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adj.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        ArrayList<Pair1> list = new ArrayList<>();

        int sum = primsAlgorithm(adj, V, list);

        System.out.println("The sum of the MST is " + sum);

        for (Pair1 it : list) {
            System.out.print("{" + it.node + "," + it.parent + "} ");
        }
    }
}
