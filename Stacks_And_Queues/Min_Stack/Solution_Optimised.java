class MinStack {
    
    Stack<Long> st;
    long min;

    public MinStack() {
        st=new Stack<>();
        min=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        
        long value=val;

        if(st.isEmpty()){
            st.push(value);
            min=value;
        }

        else{
            if(value<min){
                st.push(2*value-min);
                min=value;
            }

            else st.push(value);
        }
    }
    
    public void pop() {
        
        if(st.isEmpty()) return;
        long val=st.pop();
        if(val<min) min= 2*min-val;

    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long val=st.peek();
        if(val<min) return (int) min;
        return (int) val; 
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
