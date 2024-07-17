class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> temp= new ArrayList<>();
        long a=1;
        temp.add(1);
        rowIndex++;
        for(int i=1;i<rowIndex;i++){
            a=a*(rowIndex-i)/i;
            temp.add((int)a);
        }

        return temp;

    }
}
