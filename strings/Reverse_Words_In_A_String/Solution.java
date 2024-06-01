class Solution {
    public String reverseWords(String s) {
       
        s=s.trim();
        String rev="";

       

        for(int i=s.length()-1;i>=0;i--){
           
            if(s.charAt(i)==' ') continue;

            String ans="";

            while(i>=0 && Character.isLetterOrDigit(s.charAt(i))){
                ans=s.charAt(i)+ans;
                i--;
               
            }

           
            if(rev.length()!=0){
                rev=rev+" "+ans;
            }

            else{
                rev=ans;
            }


        }

        return rev.trim();
    }
}

