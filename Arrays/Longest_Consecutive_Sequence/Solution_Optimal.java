class Solution {
    public int longestConsecutive(int[] arr) {
       
        if(arr.length==0){
            return 0;
        }

        HashSet<Integer> set= new HashSet<>();
        int cnt=0, max=1;
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }

        for(int it: set){
            if(!set.contains(it-1)){
                cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }

                max=Math.max(max,cnt);
            }
        }

        return max;
    }
}
