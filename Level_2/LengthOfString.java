package Java.Level_2;
import java.util.*;
public class LengthOfString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = Length(s);
        int len = s.length();
        if(l==len){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
    public static int Length(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                c++;
            }
        }
        return c;
    }
}