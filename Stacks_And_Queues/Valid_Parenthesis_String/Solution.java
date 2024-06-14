class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> opening=new Stack<>();
        Stack<Integer> star=new Stack<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') opening.push(i);

            else if(s.charAt(i)=='*') star.push(i);

            else{
                if(!opening.isEmpty()) opening.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }

        }

        while(!opening.isEmpty() && !star.isEmpty()){
            if(opening.peek()<star.peek()){
                opening.pop();
                star.pop();
            }
            else break;
        }

        return opening.isEmpty();
    }
}
