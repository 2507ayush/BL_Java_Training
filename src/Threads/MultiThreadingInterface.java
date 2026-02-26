package Threads;
import java.util.*;
public class MultiThreadingInterface implements Runnable {
    private int n;
    public MultiThreadingInterface(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        int k=n;
        int rev=0;
        while(k!=0){
            int r = k%10;
            rev =rev*10+r;
            k=k/10;
        }
        if(rev==n){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not Palindrome Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Thread t1=new Thread(new MultiThreadingInterface(n));
        t1.start();
    }
}
