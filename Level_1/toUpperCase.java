package Java.Level_1;
import java.util.*;
public class toUpperCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = Convert(s);
        String c1 = s.toUpperCase();
        System.out.println(c);
        System.out.println(c1);
        if(c.equals(c1)){
            System.out.println("Both Are Equal");
        }
        else{
            System.out.println("Both are Un'Equal");
        }
        sc.close();
    }
    public static String Convert(String s){
        String s1="";
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            if(k>=97 && k<=122){
                char n = (char)(k-32);
                s1 = s1 + n;
            }
            else{
                s1=s1+k;
            }
        }
        return s1;
    }
}