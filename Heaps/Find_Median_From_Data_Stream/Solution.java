class MedianFinder {
    
    PriorityQueue<Integer> minHeap=null;
    PriorityQueue<Integer> maxHeap=null;

    public MedianFinder() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0 || maxHeap.peek()>=num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }

        balance();
    }

    public void balance(){
        if(minHeap.size()-maxHeap.size()>1) maxHeap.add(minHeap.poll());
        else if(maxHeap.size()-minHeap.size()>1) minHeap.add(maxHeap.poll());
    }
    
    public double findMedian() {
        
        if(minHeap.size()>maxHeap.size()) return minHeap.peek();
        else if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        else return (minHeap.peek()+maxHeap.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
