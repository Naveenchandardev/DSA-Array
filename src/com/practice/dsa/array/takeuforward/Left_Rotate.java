package com.practice.dsa.array.takeuforward;

import java.util.Arrays;

public class Left_Rotate {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];
        int k = 0;
        for (int i = d; i < n; i++) {
            temp[k++] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            temp[k++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);
        System.out.println("Left rotated array: " + Arrays.toString(arr));
    }
}
