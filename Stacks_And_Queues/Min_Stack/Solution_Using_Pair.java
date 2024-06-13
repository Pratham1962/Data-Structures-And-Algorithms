class Pair {
    int data;
    int min;

    public Pair(int _data, int _min) {
        this.data = _data;
        this.min = _min;
    }
}

class MinStack {
    Stack < Pair > stack;
    int minValue;
    public MinStack() {
        stack = new Stack < > ();
        minValue = Integer.MAX_VALUE;

    }

    public void push(int val) {
        if (val < minValue) minValue = val; 

        stack.push(new Pair(val, minValue));
    }

    public void pop() {

        stack.pop();
        if (!stack.isEmpty()) {
            minValue = stack.peek().min;
        } else {
            minValue = Integer.MAX_VALUE; 
        }
    }

    public int top() {
        return stack.peek().data;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
