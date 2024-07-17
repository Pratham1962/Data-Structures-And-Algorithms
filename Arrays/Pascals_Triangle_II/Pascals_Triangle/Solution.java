class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();

        ans.add(1);
        rowIndex++;
        int temp=1;

        for(int i=1;i<rowIndex;i++){
            temp=temp*(rowIndex-i);
            temp=temp/i;
            ans.add(temp);
        }   

        return ans;
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
       
        for(int i=0;i<numRows;i++){
            result.add(getRow(i));
        }

        return result;
    }
}
