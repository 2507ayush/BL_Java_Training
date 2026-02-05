package Java.Level_3;
import java.util.*;
class NumberChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = countDigits(num);
        int[] digits = storeDigits(num);
        System.out.println("Count of digits: " + count);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        int sum = sumDigits(digits);
        System.out.println("Sum of digits: " + sum);
        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Harshad Number: " + isHarshad(num, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + "      " + freq[i][1]);
        }
        sc.close();
    }
    
    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }
}
