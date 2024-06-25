package com.practice.dsa.array;

import java.util.HashMap;
import java.util.function.BiFunction;

public class RemoveDuplicatesByMap {
    public static void main(String[] args) {
        int []a={1,2,5,2,6,8,4};
        BiFunction<Integer, Integer, Integer> remappingFunction = (key, value) -> (value == null) ? 1 : value + 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : a) {
            map.compute(element, remappingFunction);
        }
        for (int element : a) {
            if (map.get(element) == 1) {
                System.out.print(element + " ");
            }
        }

    }
}
