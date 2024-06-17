class Solution{
    public static int kthSmallest(int[] nums, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){

            if(i<k) pq.add(nums[i]);

            else{
                if(pq.peek()>nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }

            }
        }

        return pq.peek();
    } 
}
