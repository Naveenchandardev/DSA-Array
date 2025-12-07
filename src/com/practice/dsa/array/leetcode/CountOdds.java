package com.practice.dsa.array.leetcode;

public class CountOdds {
    public static void main(String[] args) {
        int low =3;   int high =7;
        System.out.println(resultss(low, high));
    }

    private static int  resultss(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}
