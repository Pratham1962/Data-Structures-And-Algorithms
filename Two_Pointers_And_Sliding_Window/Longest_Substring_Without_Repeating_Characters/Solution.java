class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int low=0;
        int high=0;
        int[] map=new int[256];
        int max=0;
        int n=s.length();

        while(high<n){

            map[s.charAt(high)]++;
            while(map[s.charAt(high)]>1){
                map[s.charAt(low)]--;
                low++;
            }

            max=Math.max(max,high-low+1);
            high++;
            
        }

        return max;
    }
}
