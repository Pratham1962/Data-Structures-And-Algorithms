class Solution {

  // TC : O(n)
  // SC:  O(n)
  public int candy(int[] ratings) {
   
   int n = ratings.length;
    int sum=0;
   int[] arr = new int [n];

    Arrays.fill(arr,1);

    for(int i=0;i<n-1;i++){
        if(ratings[i]<ratings[i+1]){
            arr[i+1] = arr[i] +1;
        }
    }

    for(int i=n-1;i>=1;i--){
        if(ratings[i-1]>ratings[i]){
            if(arr[i-1] <= arr[i] ) {
                arr[i-1] = arr[i]+1;
            }
        }
    }

    for(int ele: arr){
        sum+=ele;
    }

    return sum;
  }
}
