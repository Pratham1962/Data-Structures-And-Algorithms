class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        int max=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        int n=max+k;

        int cnt=0;
        int j=0;

        for(int i=1;i<=n;i++){
            if(j==arr.length|| i!=arr[j]){
                cnt++;

                if(cnt==k) return i;
            }

            else {
                j++;
                 
            }
        }

        return -1;
    }
}

