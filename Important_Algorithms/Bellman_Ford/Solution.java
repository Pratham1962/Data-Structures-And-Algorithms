import java.util.*;

public class Main {

    public static int[] bellmanFord(ArrayList<ArrayList<Integer>> edges, int V, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (ArrayList<Integer> edge : edges) {
                int u = edge.get(0);
                int v = edge.get(1);
                int weight = edge.get(2);
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            int weight = edge.get(2);
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                return new int[] { -1 }; // Indicates a negative weight cycle
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<>(Arrays.asList(2, 4, 3)));
            }
        };

        int src = 0;
        int[] dist = bellmanFord(edges, V, src);

        if (dist.length == 1 && dist[0] == -1) {
            System.out.println("Graph contains a negative weight cycle");
        } else {
            for (int distance : dist) {
                System.out.print(distance + " ");
            }
        }
    }
}
