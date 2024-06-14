class Solution {
    public String removeKdigits(String s, int k) {
        
        Stack<Character> st=new Stack<>();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        if(k==n) return "0";

        int i=0;

        while(i<n){

            while(k>0 && !st.isEmpty() && st.peek()>s.charAt(i)){
                st.pop();
                k--;
            }

            st.push(s.charAt(i));
            i++;
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb=sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
