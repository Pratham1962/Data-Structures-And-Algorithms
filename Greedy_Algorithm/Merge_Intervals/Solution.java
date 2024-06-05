public class Solution {
    public int[][] merge(int[][] intervals) {
       
        List<int[]> res = new ArrayList<>();

        if (intervals.length <= 0) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // [[1,3],[2,6],[8,10],[15,18]]
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] interval : intervals) {
            if (interval[0] <= end) {

                end = Math.max(end, interval[1]);
            } else {
                res.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        res.add(new int[]{start, end});
        return res.toArray(new int[0][0]);
    }
}
