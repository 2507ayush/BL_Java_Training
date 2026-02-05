package Java.Level_1;
import java.util.*;
public class Athlete_Run{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double res = Calculate(a,b,c);
        System.out.println("No. of rounds = "+res);
        sc.close();
    }
    public static double Calculate(int a, int b, int c){
        int sum = a+b+c;
        double round = 5000/sum;
        return round;
    }
}