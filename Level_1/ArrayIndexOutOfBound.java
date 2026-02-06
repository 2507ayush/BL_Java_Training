package Java.Level_1;
import java.util.*;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        try {
            generateException(names);
        }
        catch (Exception e) {
            System.out.println("\nProgram stopped due to exception in generateException()");
        }
        handleException(names);
        sc.close();
    }
    
    static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        System.out.println(names[names.length]);
    }
    static void handleException(String[] names) {
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            System.out.println("Message: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
