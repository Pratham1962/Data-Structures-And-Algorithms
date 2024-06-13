class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        Stack<Integer> st=new Stack<Integer>();
        int[] arr=new int[n];

        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i%n]>=st.peek()){
                st.pop();
            }

            if(i<n){
                if(!st.isEmpty()){
                    arr[i]=st.peek();
                }
                else{
                    arr[i]=-1;
                }
            }

            st.push(nums[i%n]);
        }

        return arr;
    }
}
