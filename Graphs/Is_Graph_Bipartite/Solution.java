class Solution {

    public static boolean dfs(int node, int[][] graph, int[] visited, int color) {
        visited[node] = color;

        for (int neighbor : graph[node]) {
            if (visited[neighbor] == -1) {
                if (!dfs(neighbor, graph, visited, 1 - color)) {
                    return false;
                }
            } else if (visited[neighbor] == visited[node]) {
                return false;
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);

        for (int i = 0; i < n; i++) {
            if (visited[i] == -1) {
                if (!dfs(i, graph, visited, 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}
