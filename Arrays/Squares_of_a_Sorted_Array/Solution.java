class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int n=nums.length;
        int[] result=new int[n];

        for(int i=0;i<nums.length;i++){

            nums[i]*=nums[i];
        }

        int head=0;
        int tail=n-1;


// The largest elements will be at extreme ends so therefore we take a reverse loop
        for(int i=n-1;i>=0;i--){
            if(nums[head]>=nums[tail]){
                result[i]=nums[head];
                head++;

            }

            else{
                result[i]=nums[tail];
                tail--;
            }

        }

        return result;
    }
}
