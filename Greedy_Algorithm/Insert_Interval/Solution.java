class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> new_intervals=new ArrayList<>();

        int i=0;
        
        for(i=0;i<intervals.length;i++){
            if(intervals[i][1]<newInterval[0]){
                new_intervals.add(intervals[i]);
            }

            else if(intervals[i][0]>newInterval[1]){
                break;
            }

            else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }

        new_intervals.add(new int[] {newInterval[0], newInterval[1]});

        while(i<intervals.length){
            new_intervals.add(intervals[i]);
            i++;
        }

        return new_intervals.toArray(new int[0][0]);

    }
}
