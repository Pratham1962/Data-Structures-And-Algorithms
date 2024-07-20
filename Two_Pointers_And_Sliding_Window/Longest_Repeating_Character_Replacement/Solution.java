class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] hash=new int[26];
        int low=0;
        int high=0;
        int n=s.length();
        int max=0;
        int len=0;

        while(high<n){

            hash[s.charAt(high)-'A']++;
            max=Math.max(max, hash[s.charAt(high)-'A']);

            while((high-low+1)-max>k){

                hash[s.charAt(low)-'A']--;
                low++;

                max=0;

                for(int i=0;i<26;i++){
                    max=Math.max(max,hash[i]);
                }
            }

            len=Math.max(len,high-low+1);
            high++;
        }

        return len;
    }
}
