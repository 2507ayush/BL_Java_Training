package Java.Level_1;
import java.util.*;
public class Chocolate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOfChocolate = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        int calc = Calculate(numberOfChildren,numberOfChocolate);
        System.out.println("Every children will get "+calc+" Chocolate");
        sc.close();
    }
    public static int Calculate(int n,int m){
        int res = m/n;
        return res;
    }
}