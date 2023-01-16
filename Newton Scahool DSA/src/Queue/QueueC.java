package Queue;

public class QueueC {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    QueueC(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return  rear ==-1 && front == -1;
    }

    public static boolean isFull() {
        return (rear+1)%size == front;
    }

    //add
    public static void add(int data){
        if (isFull()){
            System.out.println("queue is full");
            return;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
    }

    //remove
    public static int remove(){
        if (isEmpty()){
            System.out.println("qmpty queue");
            return -1;
        }
        int result = arr[front];
        front = (front+1)%size;
        return result;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty quene");
            return -1;
        }
        return arr[front];

    }
    public static void main(String[] args) {
        QueueC q = new QueueC(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
