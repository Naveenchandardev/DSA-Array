package com.practice.dsa.array.leetcode;

public class DivideIntegers {
    public static void main(String[] args) {
//https://leetcode.com/problems/divide-two-integers/description/
        System.out.println(divide(10, 3));
        System.out.println(divide(7, -3));
        System.out.println(divide(-7, 3));
        System.out.println(divide(-10, -3));
    }
    private static double divide(int dividend, int divisor) {
        return (double) dividend /  (double) divisor;
    }
}
