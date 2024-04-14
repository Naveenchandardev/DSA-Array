package com.practice.dsa.array.GeeksforGeeks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Currency {
    public static void main(String[] args) {
        /*Output : Currency  Count
        2000 : 1
        200 : 2
        50 : 1
        5 : 1
        1 : 1*/

        int a = 2456;
        Map<Integer, Integer> res = findCurrencyCount(a);
        for (Map.Entry<Integer,Integer> sol : res.entrySet()) {
            System.out.println(sol.getKey() + " : " + sol.getValue());
        }
    }
    private static Map<Integer, Integer> findCurrencyCount(int a) {
        Map<Integer,Integer> res = new LinkedHashMap<>();
        int[] values = { 2000, 500, 200, 100, 50, 20, 10, 5, 1};
        for (int value : values) {
            if (a >= value) {
                res.put(value,  a / value);
                a = a % value;
            }
            if(a==0)return res;
        }
        return res;
    }
}
