package com.practice.dsa.array.leetcode;

public class CountOdds {
    //https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/?envType=daily-question&envId=2025-12-07
    public static void main(String[] args) {
        int low =3;   int high =7;
        System.out.println(countOddsResult(low, high));
        System.out.println(countEvenResults(low, high));
    }

    private static int countEvenResults(int low, int high) {
        int total = (high - low) + 1;
        int odd = (high + 1) / 2 - (low / 2);
        return total- odd;
    }

    private static int  countOddsResult(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}
