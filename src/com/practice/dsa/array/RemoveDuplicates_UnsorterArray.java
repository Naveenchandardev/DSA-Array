package com.practice.dsa.array;

public class RemoveDuplicates_UnsorterArray {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2};
        int n = arr.length;
        int newSize = removeDuplicates(arr, n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int removeDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < index; i++) {
            arr[i] = temp[i];
        }
        return index;
    }
}
