class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        int low=0;
        int high=numbers.length-1;
        int[] arr= new int[2];
        int sum=0;

        while(low<=high){
           
            sum=numbers[low]+numbers[high];
            if(sum==target){
                arr[0]=low+1;
                arr[1]=high+1;

                return arr;
            }

            else if(sum>target){
                high--;
            }

            else{
                low++;
            }
        }

        return arr;
    }
}

