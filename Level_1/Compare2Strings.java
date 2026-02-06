package Java.Level_1;
import java.util.*;
public class Compare2Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        s=s.trim();
        s1=s1.trim();
        boolean res = CheckString(s,s1);
        if(res){
            System.out.println("Both the Strings are Equal");
        }
        else{
            System.out.println("Both the Strings are un-Equal");
        }

        if(s.equals(s1)){
            System.out.println("Strings are Equal by using Inbuilt function as well");
        }
        else{
            System.out.println("Not Equal");
        }
        sc.close();
    }
    public static boolean CheckString(String s,String s1){
        if(s.length()!=s1.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
}