package Java.Sorting;
import java.util.*;
public class Insertion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArray = Sorting(arr);
        for(int i=0;i<n;i++){
            System.out.println(sortedArray[i] + " ");
        }
        sc.close();
    }
    public static int[] Sorting(int[] arr){
        int l = arr.length;
        int i,j;
        for(i=1;i<l;i++){
            j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}