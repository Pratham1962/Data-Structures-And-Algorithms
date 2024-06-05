class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int starting_point=0;
        int total_surplus=0;
        int surplus=0;

        for(int i=0;i<gas.length;i++){
            total_surplus+= gas[i] - cost[i];

            surplus+=gas[i] - cost[i];

            if(surplus<0){
                surplus=0;
                starting_point=i+1;
            }
        }

        return (total_surplus>=0)? starting_point:-1; 

    }
}
