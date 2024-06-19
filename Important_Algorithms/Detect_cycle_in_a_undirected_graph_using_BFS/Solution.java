import java.util.*;

class Pair{
    int cur;
    int prev;
    
    public Pair(int cur,int prev){
        this.cur=cur;
        this.prev=prev;
    }
}

class Main {
    
    public static boolean isCycleBFS(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Pair> queue = new LinkedList<>();
        int[] visited=new int[V];
        
        queue.offer(new Pair(1,-1));
        visited[1]=1;
        
        while(!queue.isEmpty()){
            int cur=queue.peek().cur;
            int prev=queue.peek().prev;
            queue.poll();
            
            for(int it:adj.get(cur)){
                if(it==prev) continue;
                else if(visited[it]==0){
                    queue.offer(new Pair(it, cur));
                }
                
                else return false;
            }
        }
        
        return true;
        
    }
    
    public static void main(String[] args) {
        
        int v=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
        adj.get(1).add(3);
        
        
        boolean ans = isCycleBFS(v, adj);
        
        if (!ans)
            System.out.println("There exist a cycle");    
        else
            System.out.println("There does not exist a cycle");
    }
}

