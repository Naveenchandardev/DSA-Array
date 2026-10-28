package com.practice.dsa.array.interview_questions;

import java.util.Arrays;

public class Three_Sum {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9};
        int result[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < 2) {
                result[i] = a[i];
            } else {
                result[i] = a[i] + a[i - 1] + a[i - 2];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
