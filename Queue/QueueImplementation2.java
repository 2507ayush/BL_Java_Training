package Java.Queue;
import java.util.*;
public class QueueImplementation2{
    int rear = -1;
    int front = -1;
    ArrayList<Integer> ls;
    QueueImplementation2(){
        ls = new ArrayList<>();
        rear=-1;
        front=-1;
    }
    void push(int val){
        ls.add(val);
        rear++;
        System.out.println("Pushed Value = "+val);
    }
    int pop(){
        if(rear==-1){
            System.out.println("Stack UnderFlow");
        }
        int temp = ls.get(front+1);
        ls.remove(front+1);
        rear--;
        return temp;
    }

    int peek(){
        return ls.get(0);
    }
    public static void main(String args[]){
        QueueImplementation2 q = new QueueImplementation2();
        q.push(5);
        q.push(4);
        q.push(3);
        q.push(2);
        System.out.println(q.pop()+" Popped Element");
        System.out.println("Front Element = "+q.peek());
    }
}