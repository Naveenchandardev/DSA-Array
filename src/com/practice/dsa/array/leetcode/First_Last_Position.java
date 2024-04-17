package com.practice.dsa.array.leetcode;

import java.util.Arrays;

public class First_Last_Position {
    public static void main(String[] args) {
        int a[] = {5, 7, 7, 8, 8, 10};
        int key = 2;
        int res []= findsss(a, key);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findsss(int[] a, int key) {
        int res[] = new int[2]; boolean check=false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                res[0] = i;check=true;
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == key) {
                res[1] = i;check=true;
                break;
            }
        }
        if(!check){
            res[0]=-1;res[1]=-1;
        }
        return res;
    }
}
