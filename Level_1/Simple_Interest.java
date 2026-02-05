package Java.Level_1;
import java.util.*;
public class Simple_Interest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        double SI = Calculate_Interest(principal,rate,time);
        System.out.println("The Simple Interest is = "+ SI +" for principal = "+principal+" Rate of interst = "+rate+" and Time = "+time);
        sc.close();
    }

    public static double Calculate_Interest(int principal, int rate, int time){
        double SI = (principal*rate*time)/100;
        return SI;
    }
}