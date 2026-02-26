package Threads;
import java.util.*;

public class MultiThreading{
    public static void main(String[] args)
//            throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check from Palindrome = ");
        int n = sc.nextInt();
        System.out.println("Enter a number to check for prime = ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number to check for Even and Odd = ");
        int n2 = sc.nextInt();
        Palindrome t1 = new Palindrome(n);
        Prime t2 = new Prime(n1);
        EvenOddChecker t3 = new EvenOddChecker(n2);
        t1.start();
//        t2.sleep(3000);
        t2.start();
        t3.start();
    }
}

class EvenOddChecker extends Thread {
    private int n;
    public EvenOddChecker(int n){
        this.n = n;
    }

    @Override
    public void run() {
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

class Palindrome extends Thread {
    private int n;

    Palindrome(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int rev = 0;
        int k = n;
        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == k) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
class Prime extends Thread {
        private int n;

        Prime(int n) {
            this.n = n;
        }
        @Override
        public void run() {
            int c=0;
            for(int i=1;i<=n;i++) {
                if(n%i==0) {
                    c++;
                }
            }
            if(c==2) {
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
}
