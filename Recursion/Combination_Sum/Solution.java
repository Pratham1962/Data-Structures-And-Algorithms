class Solution {

    public static void sum(int index, int n, int[] candidates, int target, List<List<Integer>> ans,List<Integer> list ){
        
        if(index==n){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }

            return;
        }

        if(candidates[index]<=target){
            list.add(candidates[index]);
            sum(index,n,candidates,target-candidates[index],ans,list);
            list.remove(list.size()-1);
        }
        
        sum(index+1,n,candidates,target,ans,list);

    }

    public List<List<Integer>> combinationSum(int[] canditates, int target) {
        int n=canditates.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        sum(0, n,canditates, target, ans,temp);

        return ans;
    }
}
