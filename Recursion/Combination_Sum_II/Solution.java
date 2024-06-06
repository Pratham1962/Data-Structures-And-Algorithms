class Solution {

    public static void subset(int idx, int[] arr, int target,List<List<Integer>> ans,  List<Integer> list){
       
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            list.add(arr[i]);
            subset(i+1, arr,target-arr[i], ans,list);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp= new ArrayList<>();

        subset(0, candidates,target, ans,temp);
        return ans;
    }
}

