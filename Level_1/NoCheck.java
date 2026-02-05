package Java.Level_1;
import java.util.*;
public class NoCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = Check(n);
        if(res==1){
            System.out.println("No. is Possitive");
        }
        else if(res==-1){
            System.out.println("No. is Negative");
        }
        else{
            System.out.println("No. is Zero");
        }
        sc.close();
    }
    public static int Check(int n){
        if(n>0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}