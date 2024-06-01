class Solution {
    public int longestPalindrome(String s) {
       
        int[] freq=new int[128];
        int result=0;
        boolean check=false;
        for(char ch: s.toCharArray()){
            freq[ch]++; // Automatically converts in into ASCII values
        }

        for(int i=0;i<128;i++){
            if(freq[i]%2==0){
                result+=freq[i];
            }

            else{
                check=true;
                result+=freq[i]-1;
            }
        }

        if(check){
            result+=1;
        }

        return result;
    }
}

