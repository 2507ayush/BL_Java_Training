package Java.Level_2;
import java.util.*;
public class LargestAndSecond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        int a=0;
        while(n!=0){
            int r=n%10;
            arr[a] = r;
            a++;
            n=n/10;
        }
        Arrays.sort(arr);
        int l = arr.length;
        System.out.println("Largest Number = "+arr[l-1]);
        System.out.println("Second Largest Number = "+arr[l-2]);
        sc.close();
    }
}