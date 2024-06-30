package com.practice.dsa.array.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindIndexFrom_matric {
    public static void main(String[] args) {
        Integer [][]input = {{1,2},{1,5},{6,1},{8,1}};
        System.out.println(input.length);
        int  result = solution(input);
        System.out.println(result);
    }

    private static int solution(Integer[][] strs) {
        Map<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i].length);
            System.out.println(strs.length);
            for(int j=0;j< strs[i].length;j++){
                res.put(strs[i][j],res.getOrDefault(strs[i][j],0)+1);
            }
        }
        for (Map.Entry<Integer,Integer> sol : res.entrySet()) {
            if(sol.getValue()==strs.length)return sol.getKey();
        }
        return 0;
    }
}
