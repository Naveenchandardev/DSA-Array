package com.practice.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoho_array {
    public static void main(String[] args) {
        //we have 2 arrays; a and b; create new array , element of a is not present in b;
        int []a={4,5,1,2,3};
        int []b={1,2,3};
        int []res = finds(a,b);
        System.out.println(Arrays.toString(res));
    }   private static int[] finds(int[] a, int[] b) {
        boolean check = false;  ArrayList<Integer> differenceList = new ArrayList<>();
        for(int i:a){
            for(int j:b){
                if(i==j){
                    check=true;
                    break;
                }
            }
            if(!check)
                differenceList.add(i);
        }
        return  differenceList.stream().mapToInt(i->i).toArray();
    }

}
