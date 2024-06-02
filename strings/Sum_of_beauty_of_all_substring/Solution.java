class Solution {
    public int beautySum(String s) {
        
        int beauty=0;

        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){

                freq[s.charAt(j)-'a']++;

                beauty+=getDifference(freq);
            }
        }

        return beauty;
    }

    public static int getDifference(int[] freq){

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                min=Math.min(min, freq[i]);
                max=Math.max(max,freq[i]);
            }

        }

        return max-min;

    }
}class Solution {
    public int beautySum(String s) {
        
        int beauty=0;

        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){

                freq[s.charAt(j)-'a']++;

                beauty+=getDifference(freq);
            }
        }

        return beauty;
    }

    public static int getDifference(int[] freq){

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                min=Math.min(min, freq[i]);
                max=Math.max(max,freq[i]);
            }

        }

        return max-min;

    }
}
