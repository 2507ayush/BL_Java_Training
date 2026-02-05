package Java.Level_2;
import java.util.*;
public class FactorOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factor = Factor(n);
        System.out.print("Factor of the number = ");
        for(int i=0;i<factor.length;i++){
            System.out.print(" "+factor[i]);
        }
        int sum = Sum(factor);
        System.out.println("Sum of Factors = "+sum);
        int prod = Product(factor);
        System.out.println("Product of Factor = "+prod);
        int SumOfSq = SquareSum(factor);
        System.out.println("Sum of Squares of Factor = "+SumOfSq);
        sc.close();
    }
    public static int[] Factor(int n){
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        int[] arr = new int[c];
        int a=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                arr[a]=i;
                a++;
            }
        }
        return arr;
    }
    public static int Sum(int factor[]){
        int s=0;
        for(int i=0;i<factor.length;i++){
            s=s+factor[i];
        }
        return s;
    }
    public static int Product(int factor[]){
        int p=1;
        for(int i=0;i<factor.length;i++){
            p=p*factor[i];
        }
        return p;
    }
    public static int SquareSum(int factor[]){
        int ss = 0;
        for(int i=0;i<factor.length;i++){
            ss = ss+(factor[i]*factor[i]);
        }
        return ss;
    }
}