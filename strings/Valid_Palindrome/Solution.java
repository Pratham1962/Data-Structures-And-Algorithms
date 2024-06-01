class Solution {
    public boolean isPalindrome(String s) {
        
        int n=s.length();
        int low=0;
        int high=n-1;

        while(low<=high){
            char start=s.charAt(low);
            char end=s.charAt(high);

            if(!Character.isLetterOrDigit(start)){
                low++;
            }

            else if(!Character.isLetterOrDigit(end)){
                high--;
            }

            else if(Character.toLowerCase(start)!=Character.toLowerCase(end)){
                return false;
            }

            else{
            low++;
            high--;
            }
        }

        return true;
    }
}
