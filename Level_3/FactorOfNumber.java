package Java.Level_3;
import java.util.*;
public class FactorOfNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factor = FindFactor(n);
        System.out.println("Greatest Factor = " + Greatest(factor));
        System.out.println("Sum of Factors = " + Sum(factor));
        System.out.println("Product of Factors = " + Product(factor));
        System.out.println("Product of Cube of Factors = " + Cube(factor));
        sc.close();   
    }

    public static double Cube(int[] arr){
        double p = 1;
        for(int i=0;i<arr.length;i++){
            p = p*Math.pow(arr[i],3);
        }
        return p;
    }

    public static int Product(int[] arr){
        int p=1;
        for(int i=0;i<arr.length;i++){
            p=p*arr[i];
        }
        return p;
    }

    public static int Sum(int[] arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        return s;
    }

    public static int Greatest(int[] arr){
        Arrays.sort(arr);
        int l = arr.length;
        return arr[l-1];
    }



    public static int[] FindFactor(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        int[] arr = new int[c];
        int a=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[a]=i;
                a++;
            }
        }
        return arr;
    }

}