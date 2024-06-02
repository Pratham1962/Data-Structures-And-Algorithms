class Solution {
    public int myAtoi(String s) {
        
        s=s.trim();

        int sign=1;
        long ans=0;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        if(s.charAt(0)=='-') sign=-1;
        int i=(s.charAt(0)=='+'||s.charAt(0)=='-' )? 1:0;

        while(i<s.length()){

            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) return (int) (sign * ans);

            ans=ans*10+s.charAt(i)-'0';

            if(sign==-1 && (-1)*ans<min) return min;
            if(sign==1 && ans>max) return max;
            i++;
        }

        return (int) (sign*ans);
    }
}
