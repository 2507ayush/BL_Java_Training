package Java.Searching;
import java.util.*;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to search");
        int val = sc.nextInt();
        boolean res = Searching(arr,val);
        if(res){
            System.out.println("Value found");
        }
        else{
            System.out.println("Value not found");
        }
        sc.close();
    }
    public static boolean Searching(int[] arr, int val){
        boolean flag = false;
        int l = arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]==val){
                flag = true;
            }
        }
        return flag;
    }
}