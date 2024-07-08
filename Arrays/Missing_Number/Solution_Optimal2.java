class Solution {
    public int missingNumber(int[] arr) {
       
        int n=arr.length;
       
        int s1= (n*(n+1))/2;
        int s2=0;

        for(int i=0;i<arr.length;i++){
            s2+=arr[i];
        }

        int result=s1-s2;

        return result;
    }
}
