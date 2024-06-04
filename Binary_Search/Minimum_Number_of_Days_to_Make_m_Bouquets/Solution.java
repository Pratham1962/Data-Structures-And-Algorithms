class Solution {

    public static boolean possibilityCheck(int mid, int[] bloomDay, int m, int k){
        
        int bouquet=0;
        int cnt=0;

        for(int i=0;i<bloomDay.length;i++){
            if(mid>=bloomDay[i]){
                cnt++;
            }
            else{
                if(cnt>=k){
                    bouquet+=cnt/k;
                } 
                cnt=0;
            }
        }

