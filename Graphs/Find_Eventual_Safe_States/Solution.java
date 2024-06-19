class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        int n=graph.length;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
            }
        }

        int[] indegree = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
            
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {    
            int cur = queue.poll();
            ans.add(cur);
            
            for (int it : adj.get(cur)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    queue.offer(it);
                }
            }
        }
        Collections.sort(ans);
        
        return ans;
    
    }
}
