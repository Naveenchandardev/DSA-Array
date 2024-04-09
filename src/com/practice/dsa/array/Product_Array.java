package com.practice.dsa.array;
import java.util.Arrays;

public class Product_Array {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};int prod=0;
        int[]res = new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j)continue;
                prod += a[j];
            }
            res[i]=prod;
            prod=0;
        }
        System.out.println(Arrays.toString(res));
    }
}
