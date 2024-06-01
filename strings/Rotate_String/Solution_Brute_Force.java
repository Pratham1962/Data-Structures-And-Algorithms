class Solution {
    public boolean rotateString(String s, String goal) {
        
        int n=s.length();

        String shifted="";

        for(int i=0;i<n;i++){

            shifted=s.substring(1,n);
            shifted+=s.charAt(0);
            s=shifted;

            if(shifted.equals(goal)) return true;
        }

        return false;
    }
}
