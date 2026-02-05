package Java.Level_1;
import java.util.*;
public class CanVote{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for(int i=0;i<10;i++){
            age[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(age[i]<0){
                System.out.println("Student has entered Invalid Age");
            }
            else{
                if(age[i]>18){
                    System.out.println("Student with Age "+age[i]+" can vote");
                }
                else{
                    System.out.println("Student with Age "+age[i] + " can't vote");
                }
            }
        }
        sc.close();
    }
}