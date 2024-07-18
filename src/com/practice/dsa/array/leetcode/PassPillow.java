package com.practice.dsa.array.leetcode;

public class PassPillow {
    //https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06
    public static void main(String[] args) {
        int persons=18;
        int time=38;
        int res1 =soulution1(persons,time);
        int res2 =soulution2(persons,time);
        System.out.println(res1);
        System.out.println(res2);
    }

    private static int soulution2(int persons, int time) {
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
        return res;
    }

    private static int soulution1(int n, int time) {
        int chunks = time / (n - 1);
        return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));

    }
}
