class Solution {

    public static void recursion(int index, int[] nums, List<List<Integer>> ans,List<Integer> temp ) {

 
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
           
            temp.add(nums[i]);
            recursion(i+1,nums,ans,temp);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        recursion(0,nums,ans,temp);

        return ans;
    }
}
