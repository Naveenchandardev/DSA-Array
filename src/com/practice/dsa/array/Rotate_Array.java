package com.practice.dsa.array;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
int [] a= {1,2,3,4,5};int[]b=new int[a.length];
int in=2;
        for(int i=0;i<a.length;i++){
        if(in<a.length)b[i]=a[in++];
        else b[i]=a[in++-5];
        }
        System.out.println(Arrays.toString(b));
        }
}
