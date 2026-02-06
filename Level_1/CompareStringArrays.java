package Java.Level_1;
import java.util.*;
public class CompareStringArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        char[] arr1 = Calculate(s);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]==arr1[i]){
                c++;
            }
        }
        if(c==s.length()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
    public static char[] Calculate(String s){
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            arr[i]=k;
        }
        return arr;
    }

}