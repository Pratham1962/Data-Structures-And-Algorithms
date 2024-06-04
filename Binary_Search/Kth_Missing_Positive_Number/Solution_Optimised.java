class Solution {
    public int findKthPositive(int[] arr, int k) {
       
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }

            else{
                high=mid-1;
            }
        }

        //number = arr[high]+more
        //more= k-missing
        //missing=arr[high]-(high+1)
        //so more becomes= k-(arr[high]-(high+1))
        //number=arr[high]+k-arr[high]+high+1;
        //number=high+1+k;
        
        return (high+1+k);
    }
}
