package com.practice.dsa.array.GeeksforGeeks;

import java.util.HashMap;
import java.util.Map;

public class Tri_Duplicates {
    //find numbers; having 3 times;
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 1, 1, 8, 5, 8, 6, 8, 2, 6};
        Map<Integer,Integer> res= new HashMap<>();
        for(int b: a){
            res.put(b, res.getOrDefault(b,0)+1);
        }
        System.out.println(res);
        for(Map.Entry rest: res.entrySet()){
            if(java.util.Objects.equals(rest.getValue(),3)) System.out.println(rest.getKey());
        }
    }
}
