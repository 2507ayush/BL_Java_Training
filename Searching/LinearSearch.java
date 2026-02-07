package Java.Searching;
import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elemnets of Array = ");
        for(int i=0;i<n;i++){
            System.out.print("Enter Element = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Value to search");
        int val = sc.nextInt();

        boolean Result = Searching(arr,val);
        if(Result){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target not Found");
        }
        sc.close();
    }
    public static boolean Searching(int[] arr, int target){
        int l = arr.length;
        boolean flag=false;
        for(int i=0;i<l;i++){
            if(arr[i]==target){
                flag=true;
                break;                
            }
        }
        return flag;
    }
}