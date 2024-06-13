class Queue
{   
    int rear=-1;
    int front=0;
    int[] arr=new int[5];
    int capacity=5;
    
    public void enque(int val){
        if(rear==capacity-1) System.out.println("queue is full");
        
        else{
            rear++;
            arr[rear]=val;
            System.out.println("The element is pushed: "+ arr[rear]);
        }
    }
    
    public void deque(){
        if(front>rear) System.out.println("queue is empty");
        
        else{
            System.out.println("The deque element is: "+arr[front]);
            front++;
        }
    }
    
    public void size(){
        System.out.println("The size is: "+ (rear-front+1));
    }
    
    public void peek(){

        System.out.println("The top element is: "+arr[front]);
    }
    
    
    
	public static void main(String[] args) {
	    Queue q=new Queue();
	    
	    q.enque(4);
	    q.enque(5);
	    q.enque(6);
	    q.enque(7);
	    q.enque(8);
	    
	    q.deque();
	    q.deque();
	    
	    q.size();
	    
	    q.peek();
	}
}
