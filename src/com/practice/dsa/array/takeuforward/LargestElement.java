package com.practice.dsa.array.takeuforward;

public class LargestElement {
    public static void main(String[] args) {
        int a []= {4, 5, 7};
        int largest =0;
        for(int b: a){
            largest = Math.max(b, largest);
        }
        System.out.println("largest element is "+largest);
    }
}
