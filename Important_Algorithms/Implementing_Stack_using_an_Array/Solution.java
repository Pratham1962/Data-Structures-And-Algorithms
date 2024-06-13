class Stack {
    int size = 5;
    int[] arr = new int[size];
    int top = -1;

    public void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = ele;
            System.out.println(arr[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int x = arr[top];
            top--;
            System.out.println(x);
        }
    }

    public void top() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    public void size() {
        System.out.println(top + 1);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(5);
        s.push(5);
        s.push(5);

        s.pop();

        s.size();

        s.top();
    }
}
