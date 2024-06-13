class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int count=0;

        for(char c: s.toCharArray()){
            if(c=='('){
                count++;
            }

            if(c==')'){
                count--;
            }
           
            depth= Math.max(depth,count);
        }

        return depth;
    }
}

