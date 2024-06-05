class Solution {
    public String addBinary(String a, String b) {
        
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        int carry=0;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0){
            sum=carry;

            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            } 

            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            } 

            carry=sum/2;
            sum=sum%2;
        
            sb.append(sum);
        }

        if(carry!=0) sb.append(carry);

        sb=sb.reverse();

        return sb.toString();
    }
}
