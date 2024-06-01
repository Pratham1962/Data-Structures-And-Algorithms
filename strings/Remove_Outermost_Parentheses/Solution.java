class Solution {
    public String removeOuterParentheses(String str) {
       
       boolean ans=false;
       int cnt=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                cnt++;
            }

            else if(str.charAt(i)==')'){
                cnt--;
            }

            if(cnt==2 ){
                ans=true;
            }

            else if( cnt==0){
                ans=false;
            }

            if(ans){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
