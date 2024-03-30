package com.practice.dsa.array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrayCopy {
    public static void main (String[] args){
        int [] input1= {1,5,2,3};
        int [] input2= {2,4,6};
        int [] result = new int[input2.length + input1.length];
        System.arraycopy(input1, 0, result,0, input1.length);
        System.arraycopy(input2, 0, result,input1.length, input2.length);
        System.out.println(Arrays.toString(result));

        //EASY WAY;
        int [] result2 = IntStream.concat(IntStream.of(input1),IntStream.of(input2)).toArray();
        System.out.println("result 2 : "+Arrays.toString(result2));
    }
}
