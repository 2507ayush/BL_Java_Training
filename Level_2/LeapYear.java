package Java.Level_2;
import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int res = Check(year);
        if(res==1){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
    public static int Check(int year){
        if(year>=1582 && (year%4==0 && year%100!=0)){
            return 1;
        }
        else{
            return 0;
        }
    }
}