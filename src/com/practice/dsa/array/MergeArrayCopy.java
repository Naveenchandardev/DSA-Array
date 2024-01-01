package com.practice.dsa.array;
import java.util.Arrays;
public class MergeArrayCopy {
    public static void main (String[] args){
        int [] input1= {1,5,3}; int len=input1.length;
        int [] input2= {2,4,6};
        int [] result = new int[input2.length + input1.length];
        System.arraycopy(input1, 0, result,0, input1.length);
        System.arraycopy(input2, 0, result,input1.length, input2.length);
        System.out.println(Arrays.toString(result));
    }
}
