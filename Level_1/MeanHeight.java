package Java.Level_1;
import java.util.*;
public class MeanHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int s=0;
        for(int i=0;i<11;i++){
            arr[i]=sc.nextInt();
            s=s+arr[i];
        }
        double mean = s/11;
        System.out.println("Mean of Hieght = " + mean);
        sc.close();
    }
}