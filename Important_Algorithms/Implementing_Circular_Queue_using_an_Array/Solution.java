public class Queue {
    int capacity = 4;
    int[] arr = new int[capacity];
    int front = 0;
    int rear = 0;
    int size = 0;

    public void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Cannot enqueue, queue is full");
        } else {
            arr[rear] = val;
            rear = (rear + 1) % capacity;
            size++;
            System.out.println(val + " enqueued");
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Cannot dequeue, queue is empty");
        } else {
            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println(val + " dequeued");
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Cannot peek, queue is empty");
        } else {
            int val = arr[front];
            System.out.println(val + " peeked");
        }
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.dequeue();
        q.enqueue(9);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.peek();
        q.getSize();
    }
}
