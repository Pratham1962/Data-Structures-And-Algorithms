class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       
        int n=profits.length;

        int [][] projects= new int[n][2];
        for(int i=0;i<n;i++){
            projects[i][0]=capital[i];
            projects[i][1]=profits[i];
        }

        Arrays.sort(projects, (a,b) -> Integer.compare (a[0], b[0]));

        PriorityQueue<Integer> temp = new PriorityQueue<>(Collections.reverseOrder());

        int i=0;

        while(k-->0){
            while(i<n && projects[i][0]<=w){
                temp.add(projects[i][1]);
                i++;
            }

            if(temp.isEmpty()){
               break;
            }

            w+=temp.poll();
        }

        return w;

