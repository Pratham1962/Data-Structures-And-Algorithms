class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap= new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(), b.getValue()));

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k) minHeap.poll();
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=minHeap.poll().getKey();
        }

        return ans;

    }
}
