import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alphanumeric {
    public static void check(String re,String str){
        Pattern p=Pattern.compile(re);
        Matcher m=p.matcher(str);
        System.out.println(m.matches());

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("enter pattern");
        String p=sc.nextLine();
        System.out.println("Enter string :");
        String str=sc.nextLine();
        check(p,str);
        System.out.println("Do you want to exit the programme");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("Y")){
            System.out.println("program ended");
            break;
        }
    }
    sc.close();
}
}
