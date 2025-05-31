package com.practice.dsa.array.takeuforward;

import java.util.Arrays;

public class UnionOfArrays {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] combined = new int[n1 + n2];
        System.arraycopy(arr1, 0, combined, 0, n1);
        System.arraycopy(arr2, 0, combined, n1, n2);
        Arrays.sort(combined);
        int uniqueCount = 1;
        for (int i = 1; i < combined.length; i++) {
            if (combined[i] != combined[i - 1]) {
                uniqueCount++;
            }
        }
        int[] union = new int[uniqueCount];
        union[0] = combined[0];
        int index = 1;
        for (int i = 1; i < combined.length; i++) {
            if (combined[i] != combined[i - 1]) {
                union[index++] = combined[i];
            }
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4};
        int[] arr2 = {3, 4, 5, 6};
        int[] union = findUnion(arr1, arr2);
        System.out.println("Union of arrays: " + Arrays.toString(union));
    }
}
