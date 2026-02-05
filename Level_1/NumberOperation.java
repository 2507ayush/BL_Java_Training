package Java.Level_1;
import java.util.*;
public class NumberOperation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i]+" is Even and Possitive");
                }
                else{
                    System.out.println(arr[i] + " is Odd and Possitive");
                }
            }
            else if(arr[i]<0){
                System.out.println(arr[i]+" is Negative");
            }
            else{
                System.out.println(arr[i] + " is Zero");
            }
        }
        int f = arr[0];
        int l = arr[4];
        if(f==l){
            System.out.println("First and Last numbers are equal");
        }
        else if(f>l){
            System.out.println("First number is greater than Last number");
        }
        else{
            System.out.println("The First Number is Smaller than The Last Number");
        }
        sc.close();
    }
}