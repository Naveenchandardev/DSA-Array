package com.practice.dsa.array;

public class BuyChoclates {
    public static void main(String[] args) {
        //buy 2 choclates; from given money; if can't buy; return the money;if done, return balance amount;
        int arr1[]={3,2,2}; int money =5;
        int result = checkCondition(arr1,money);
        System.out.println(result);
    }

    private static int checkCondition(int[] arr1, int money) {
        int calculate=money;
        for(int i=0;i<2;i++){
            calculate-=arr1[i];
        }
        if(calculate<0)return money;
        return calculate;
    }
}
