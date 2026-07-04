package com.practice.dsa.array;

public class ArrayToString {
    public static void main(String[] args) {
        String[] input ={"chandar","thiru","prem","sathish"};
        StringBuffer result = new StringBuffer("[");

        for (int i = 0; i < input.length; i++) {
            if (i > 0) {
                result.append(",");
            }
            result.append(input[i]);
        }

        result.append("]");
        System.out.println(result);

    }
}
