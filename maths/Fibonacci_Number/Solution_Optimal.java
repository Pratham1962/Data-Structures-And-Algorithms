class Solution {
    public int fib(int n) {
        
       if(n<=1) return n;

       int prev=0;
       int cur=1;
        int ans=0;
       
       while(n>1){
            ans=prev+cur;
            prev=cur;
            cur=ans;
            n--;
       }

       return ans;
    }
}
