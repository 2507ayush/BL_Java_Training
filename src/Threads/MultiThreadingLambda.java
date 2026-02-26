package Threads;
import java.util.*;
public class MultiThreadingLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Thread t1 = new Thread(() -> {
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
        });
        t1.start();
    }
}
