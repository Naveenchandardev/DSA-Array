package com.practice.dsa.array.takeuforward;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] a = {4, 5, 3};
        int[] res = logic(a);
        System.out.println(Arrays.toString(res));

    }

    public static int[] logic(int[] a) {
        int[] res = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            res[i - 1] = a[i];
        }
        res[a.length - 1] = a[0];
        return res;
    }
}
