package Java.Stack;
public class StackImplementation {
    int size;
    int[] arr;
    int top=-1;

    StackImplementation(int size){
        this.size=size;
        arr = new int[size];
        top=-1;
    }
    void push(int val){
        if(top==size-1){
            System.out.println("Stack OverFlow");
        }
        else{
            arr[++top] = val;
            System.out.println("Pushed Value = " + val);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(arr[top--]+" Popped Element");
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
            System.out.println("Top Element = "+arr[top]);
        }
    }

    public static void main(String args[]){
        StackImplementation s = new StackImplementation(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.pop();
        s.peek();
        s.isEmpty();
        s.pop();
    }
}