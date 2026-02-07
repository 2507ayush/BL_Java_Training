package Java.Sorting;

import java.util.*;

public class Bubble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArray = Sorting(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArray[i]);
        }
        sc.close();
    }

    public static int[] Sorting(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}