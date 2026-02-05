package Java.Level_3;
import java.util.*;
public class OTPCreator{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many OTPs to generate: ");
        int n = sc.nextInt();
        int[] otps = new int[n];
        for (int i = 0; i < n; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All OTPs unique: " + areUnique(otps));
        sc.close();
    }

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
