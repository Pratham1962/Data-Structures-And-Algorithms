class Solution {

    public static void recursion(int idx, int n, int k,List<List<Integer>> ans,  List<Integer> list){
       
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<=n;i++){

            list.add(i);
            recursion(i+1,n,k, ans,list);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();

        recursion(1, n,k, ans,temp);
        return ans;
    }
}
