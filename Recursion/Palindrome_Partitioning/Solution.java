class Solution {

    public static void partitions( int idx, String s, List<List<String>> ans, List<String> temp){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx; i<s.length() ; i++ ){
            if(isPalindrone(idx, s, i)){
                temp.add(s.substring(idx, i+1));
                partitions(i+1, s, ans, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        partitions(0, s, ans, temp);
        return ans;
    }

    public static boolean isPalindrone(int start , String s, int end){
        while(start<=end){
            if(s.charAt(start++)!= s.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}

