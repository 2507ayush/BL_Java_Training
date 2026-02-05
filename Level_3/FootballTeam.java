package Java.Level_3;
import java.util.*;
public class FootballTeam{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] team = new int[11];
        System.out.println("Enter Height of Football team in CM and from range 150 to 250 :-");
        for(int i=0;i<11;i++){
            team[i]=sc.nextInt();
        }
        System.out.println("Mean height of the Team is = "+Mean(team));
        System.out.println("The Tallest height is = " + Tallest(team));
        System.out.println("The Shortest height is = " + Shortest(team));
        sc.close();
    }
    public static int Mean(int[] arr){
        int s=0;
        for(int i=0;i<11;i++){
            s=s+arr[i];
        }
        return s/11;
    }
    public static int Tallest(int[] arr){
        Arrays.sort(arr);
        return arr[10];        
    }
    public static int Shortest(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}