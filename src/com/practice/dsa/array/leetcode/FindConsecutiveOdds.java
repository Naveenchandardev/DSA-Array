package com.practice.dsa.array.leetcode;

public class FindConsecutiveOdds {
    //if 3 consicutive odds present in array; return true;
    public static void main(String[] args) {
        boolean res=false;
        int []a={102,780,919,897,901};
        if(a.length!=3){
            for(int i=0;i<=a.length-3;i++){
                res = solution(a[i],a[i+1],a[i+2]);
            }
        }
        else{
            res = solution(a[0],a[1],a[2]);
        }
        System.out.println(res);
    }
    private static boolean solution(int i, int i1, int i2) {
        if(i%2==0)return false;
        if(i1%2==0)return false;
        if(i2%2==0)return false;
        return true;
    }
}
