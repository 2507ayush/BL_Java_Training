package Java.Level_1;
import java.util.*;
public class RemainderQuotient{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res[] = findRemainderAndQuotient(n1,n2);
        System.out.println("Remainder = "+res[0] + " Quotient = "+res[1]);
        sc.close();
    }
    public static int[] findRemainderAndQuotient(int n1,int n2){
        int res[] = new int[2];
        int rem = n1%n2;
        res[0] = rem;
        int qou = n1/n2;
        res[1]=qou;
        return res;
    } 
}