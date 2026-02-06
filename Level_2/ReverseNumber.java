package Java.Level_2;
import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int k=n;
        while(n!=0){
            a++;
            n=n/10;
        }
        int[] arr = new int[a];
        int b=0;
        while(k!=0){
            int r = k%10;
            arr[b]=r;
            b++;
            k=k/10;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}