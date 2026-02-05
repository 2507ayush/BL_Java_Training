package Java.Level_2;
import java.util.*;
public class EligibleToVote{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] Ages = new int[10];
        for(int i=0;i<10;i++){
            Ages[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(canStudentVote(Ages[i])){
                System.out.println("Student "+(i+1)+" can vote!");
            }
            else{
                System.out.println("Student "+(i+1)+" can't Vote!");
            }
        }
        sc.close();
    }
    public static boolean canStudentVote(int n){
        if(n<0){
            return false;
        }
        else{
            if(n>=18){
                return true;
            }
            else{
                return false;
            }
        }
    }
}