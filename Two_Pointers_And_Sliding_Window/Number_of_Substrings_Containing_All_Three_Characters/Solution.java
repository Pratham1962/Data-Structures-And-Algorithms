class Solution {
    public int numberOfSubstrings(String s) {
        
        int[] hash=new int[3];
        int high=0;
        int n=s.length();
        int cnt=0;
        Arrays.fill(hash,-1);

        while(high<n){

            hash[s.charAt(high)-'a']=high;

            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                int min = Math.min(hash[0], Math.min(hash[1], hash[2]));

                cnt+=1+min;
            }

            high++;
        }

        return cnt;

    }
}
