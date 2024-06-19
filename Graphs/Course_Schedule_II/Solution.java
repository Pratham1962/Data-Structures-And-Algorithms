class Solution {
    public int[] findOrder(int V, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[V];
        int n=prerequisites.length;
        Queue<Integer> queue=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        
        for (int i = 0; i < V; i++) {
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
    
        if(ans.size()==V){
            int[] topo=new int[V];
            for(int i=0;i<V;i++){
                topo[i]=ans.get(i);
            }

            return topo;
        }

        return new int[]{};
    }
}
