class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> temp=new HashSet<>();
        int sum=0;
        
        while(sum!=1){ 
            
            sum=0;
            
            while(n!=0){
                int digit=n%10;
                sum+=Math.pow(digit,2);
                n=n/10; 
            }

            if(temp.contains(sum)) return false;
            temp.add(sum);
            n=sum;
        }

        return true;
    }
}
