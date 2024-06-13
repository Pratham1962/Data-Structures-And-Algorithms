class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue=new LinkedList<>();    
    }
    
    public void push(int x) {
        queue.offer(x);
        int size=queue.size()-1;
        for(int i=0;i<size;i++){
            int val=queue.poll();
            queue.offer(val);
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {   
        return queue.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
