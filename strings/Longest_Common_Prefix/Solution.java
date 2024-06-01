class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String result="";

        String first= strs[0];
        String last=strs[strs.length-1];

        for(int i=0; i<first.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }

            else{
                result+=first.charAt(i);
            }
        }

        return result;
    }
}
