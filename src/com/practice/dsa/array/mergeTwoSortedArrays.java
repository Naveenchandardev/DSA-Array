package com.practice.dsa.array;

import java.util.Arrays;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,6};
        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        System.out.println(Arrays.toString(result));

    }
}
