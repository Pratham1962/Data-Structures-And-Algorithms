public class Queue {
    int capacity = 4;
    int[] arr = new int[capacity];
    int front = 0;
    int rear = 0;

    public void enque(int val) {
        if (rear == capacity) {
            System.out.println("Cannot enqueue, queue is full");
        } else {
            arr[rear] = val;
            rear++;
            System.out.println(val + " enqueued");
        }
    }

    public void deque() {
        if (front >= rear) {
            System.out.println("Cannot dequeue, queue is empty");
        } else {
            int val = arr[front];
            front++;
            System.out.println(val + " dequeued");

            if (front == rear) { // Reset the queue if it's empty
                front = 0;
                rear = 0;
            }
        }
    }

    public void peek() {
        if (front >= rear) {
            System.out.println("Cannot peek, queue is empty");
        } else {
            int val = arr[front];
            System.out.println(val + " peeked");
        }
    }

    public void size() {
        System.out.println("Size: " + (rear - front));
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enque(5);
        q.enque(6);
        q.enque(7);
        q.enque(8);
        q.enque(9);

        q.deque();
        q.deque();
        q.peek();
        q.size();
    }
}
