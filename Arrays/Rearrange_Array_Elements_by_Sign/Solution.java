class Solution {
    public int[] rearrangeArray(int[] arr) {
       
        int j=0;
        int k=1;
        int n=arr.length;

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[j]=arr[i];
                j=j+2;
            }

            else{
                ans[k]=arr[i];
                k=k+2;
            }
        }

        return ans;
    }
}


