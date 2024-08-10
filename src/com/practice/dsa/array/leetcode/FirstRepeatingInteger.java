package com.practice.dsa.array.leetcode;

public class FirstRepeatingInteger {
    public static void main(String[] args){
        int arr[] = {10, 3, 5, 4, 3, 5, 6};
        System.out.println(findRepeatingelement(arr));
    }

    public static int findRepeatingelement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int foundIndex = searchFromPosition(arr, arr[i], i+1);
            if(foundIndex!=-1)return arr[i];
        }
        return 0;
    }
    public static int searchFromPosition(int[] list, int element, int startPosition) {
        for (int i = startPosition; i < list.length; i++) {
            if (list[i]==element) {
                return i;
            }
        }
        return -1;
    }
}
