package Java.Queue;

public class QueueImplementation {
    int size;
    int[] arr;
    int front = -1;
    int rear = -1;

    QueueImplementation(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void push(int val) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            arr[++rear] = val;
        }
    }

    int pop() {
        int temp=arr[0];
        if (rear == -1) {
            System.out.println("Queue Underflow");
        } else {
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }
        return temp;
    }

    int peek(){
        if(rear == -1){
            System.out.println("Queue Underflow");
        }
        return arr[0];
    }
    public static void main(String args[]) {
        QueueImplementation q = new QueueImplementation(5);
        q.push(5);
        q.pop();
        q.push(4);
        q.push(5);
        q.push(3);
        q.push(2);
        System.out.println(q.pop() + " Popped Element");
        System.out.println("Front Element = " + q.peek());
    }
}