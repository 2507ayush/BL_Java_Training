package Java.Stack;
import java.util.*;
public class StackImplementation2{
    ArrayList<Integer> ls;
    int top=-1;
    StackImplementation2(){
        ls = new ArrayList<>();
        top=-1;
    }
    void push(int val){
        ls.add(val);
        top++;
        System.out.println("Pushed Value = " + val);
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(ls.get(top)+" Popped Element");
            ls.remove(top);
            top--;
        }
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Top Element = "+ls.get(top));
        }
    }
    public static void main(String args[]){
        StackImplementation2 s = new StackImplementation2();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.pop();
        s.peek();
        System.out.println(s.isEmpty());
        s.pop();
    }
}