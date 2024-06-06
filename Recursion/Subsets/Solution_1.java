class Solution {

    public static void recursion(int idx,List<List<Integer>> ans,List<Integer> temp,int[] nums){

        if(idx>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        recursion(idx+1,ans,temp,nums);
        temp.remove(temp.size()-1);
        recursion(idx+1,ans,temp,nums);


    }

    public List<List<Integer>> subsets(int[] nums) {
       
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        recursion(0,ans,temp,nums);

        return ans;
    }
}

