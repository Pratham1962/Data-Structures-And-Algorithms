class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0) return true;

        int low=0;
        int high=0;

        while(high<t.length()){
            if(t.charAt(high)==s.charAt(low)){
                low++;

                if(low==s.length()) return true;
            }

            high++;
        }

        return false;
    }
}
