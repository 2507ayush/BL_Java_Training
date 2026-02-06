package Java.Level_1;
import java.util.*;
public class StringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception.");
        }
        handleException(input);
        sc.close();
    }

    public static void generateException(String str) {
        System.out.println("\nGenerating Exception...");
        char ch = str.charAt(str.length());
        System.out.println(ch);
    }

    public static void handleException(String str) {
        System.out.println("\nHandling Exception...");
        try {
            char ch = str.charAt(str.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
