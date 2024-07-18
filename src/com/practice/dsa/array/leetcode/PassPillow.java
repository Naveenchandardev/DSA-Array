package com.practice.dsa.array.leetcode;

public class PassPillow {
    //https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06
    public static void main(String[] args) {
        int persons=4;
        int time=5;
        int res =0;
        boolean ch=false;
        for(int i=0;i<=time;i++){
            if(res<persons && !ch){
                res++;
            }
            else {
                res--;
                ch=true;
            }
        }
        System.out.println(res);
    }
}
