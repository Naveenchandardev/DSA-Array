package com.practice.dsa.array;

 
public class InsertionOrder {
    public static void main(String[] args) {
        //find insert position of "target" sorted array a[]
        int a[]={1,3,4,6}; int target =10;
        int result = checkCondition(a,target);
        System.out.println(result);
    }
    private static int checkCondition(int[] arr1, int target) {
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]<=target && arr1[i+1]>=target){
                return i+1;
            } else {
                return  arr1.length;
            }
        }
        return target;
    }
}
