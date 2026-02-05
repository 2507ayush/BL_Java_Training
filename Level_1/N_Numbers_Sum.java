package Java.Level_1;
import java.util.*;
public class N_Numbers_Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Sum(n);
        System.out.println("Sum of N natural numbers = "+sum);
        sc.close();
    }
    public static int Sum(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
        }
        return s;
    }
}