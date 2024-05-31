class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0) return false;

        String s=Integer.toString(x);

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
    
        return s.equals(sb.toString());

    }
}
