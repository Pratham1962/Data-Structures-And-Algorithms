class Solution {

    public static void recursion(int idx, int k, int target,List<List<Integer>> ans,  List<Integer> list){
       
        if(target==0){
            if(list.size()==k) ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<=9;i++){
            if(i>target) break;

            list.add(i);
            recursion(i+1,k,target-i, ans,list);
            list.remove(list.size()-1);
        }
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();

        recursion(1, k,n, ans,temp);
        return ans;
    }
}
