package Java.Level_3;

import java.util.*;

public class NumberChecker4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Prime number :" + Prime(num));
        System.out.println("Neon Number : " + Neon(num));
        System.out.println("Spy Number : " + Spy(num));
        System.out.println("Automorphic Number : " + Automorphic(num));
        System.out.println("Buzz Number : "+Buzz(num));

        sc.close();
    }

    public static boolean Buzz(int n){
        if(n%7==0 || n%10==7){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean Automorphic(int n) {
        int sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10){
                return false;
            }
            n /= 10;
            sq /= 10;
        }
        return true;
    }

    public static boolean Spy(int n) {
        int s = 0;
        int p = 1;
        int k = n;
        while (k != 0) {
            int r = k % 10;
            s = s + r;
            p = p * r;
            k = k / 10;
        }
        if (s == p) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Prime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Neon(int n) {
        int sq = n * n;
        int s = 0;
        while (sq != 0) {
            int r = sq % 10;
            s = s + r;
            sq = sq / 10;
        }
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }

}
