class Solution {
    public String longestPalindrome(String s) {
        

        if(s.length()<=1) return s;
        
        String LPS="";
        int low=0;
        int high=0;
        String t="";

        for(int i=1;i<s.length();i++){

            low=i;
            high=i;

            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low<0 || high>=s.length()) break;
            }    
            
            t=s.substring(low+1,high);

            if(t.length()>LPS.length()) LPS=t;

            low=i-1;
            high=i;

            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;

                if(low<0 || high>=s.length()) break;
            }    
            
            t=s.substring(low+1,high);

            if(t.length()>LPS.length()) LPS=t;

        }

        return LPS;
    }
}
