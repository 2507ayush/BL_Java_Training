package Java.Searching;

import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to search");
        int val = sc.nextInt();
        boolean res = Searching(arr, val);
        if (res) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found");
        }
        sc.close();
    }

    public static boolean Searching(int[] arr, int val) {
        boolean flag = false;
        int l = arr.length;
        Arrays.sort(arr);
        int left = arr[0];
        int right = arr[l - 1];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == val) {
                flag = true;
            } else if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return flag;
    }
}