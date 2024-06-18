import java.util.ArrayList;

class Solution {
   
    public static void DFS(int node, ArrayList<ArrayList<Integer>> al, boolean[] visit) {
        visit[node] = true;
        for (Integer it : al.get(node)) {
            if (!visit[it]) {
                DFS(it, al, visit);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < isConnected.length; i++) {
            al.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    al.get(i).add(j);
                    al.get(j).add(i);
                }
            }
        }

        int count = 0;
        boolean[] visit = new boolean[isConnected[0].length];

        
        for (int i = 0; i < isConnected[0].length; i++) {
            if (!visit[i]) {
                DFS(i, al, visit);
                count++;
            }
        }

        return count;
    }
}
