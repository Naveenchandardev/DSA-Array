package com.practice.dsa.array.interview_questions;

import java.util.Arrays;

public class Three_Sum {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9}; int k=2;
        int result[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < k-1) {
                result[i] = a[i];
            } else {
                for(int j=0;j<k;j++){
                    result[i]=result[i]+a[i-j];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
