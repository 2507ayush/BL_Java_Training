package Java.Generics;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int n1 = sc.nextInt();
        // Box<String> box = new Box<>();
        // Box<Integer> box1 = new Box<>();
        // box1.setValue(n1);
        // box.setValue(n);
        // System.out.println("Value = "+box.getValue());
        // System.out.println("Value2 = " + box1.getValue());
        pair<String,Integer> p = new pair<>(n,n1);
        System.out.println(p.getKey());
        System.out.println(p.getValue());
        sc.close();
    }
}
