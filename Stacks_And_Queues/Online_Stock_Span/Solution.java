class Pair{
    int data;
    int idx;

    public Pair(int data, int idx){
        this.data=data;
        this.idx=idx;
    }
}

class StockSpanner {

    Stack<Pair> st;
    int index=0;

    public StockSpanner() {
        st=new Stack<>();    
    }
    
    public int next(int price) {
        
        int span=1;

        index++;

        while(!st.isEmpty() && st.peek().data<=price){
            st.pop();
        }

        if(!st.isEmpty() && st.peek().data>price) span=index-st.peek().idx;
        else span=index; 

        st.push(new Pair(price, index));

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
