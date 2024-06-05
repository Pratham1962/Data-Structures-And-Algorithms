class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int n=bills.length;
        int cnt5=0;
        int cnt10=0;

        for(int i=0;i<n;i++){

            if(bills[i]==5) cnt5++;

            else if(bills[i]==10){
                cnt10++;

                if(cnt5>=1) cnt5--;
                else return false;
            }
            else{

                if(cnt5>=1 && cnt10>=1){
                    cnt5--;
                    cnt10--;
                }

                else if(cnt5>=3){
                    cnt5-=3;
                }

                else return false;
            } 

        }

        return true;
    }
}
