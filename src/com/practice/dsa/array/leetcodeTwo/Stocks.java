package com.practice.dsa.array.leetcodeTwo;

import java.util.HashMap;
import java.util.Map;

public class Stocks {
    // Best Time to Buy and Sell Stock
    public static void main(String[] args) {
        int [] prices ={7,1,5,3,10,4};
        int buy=prices[0];  int sell=0;
        int date =0;
        for(int i=1;i<prices.length-1;i++){
            if(prices[i]<buy){
                date =i;
                buy=prices[i];
            }
        }
        for(int i=date;i<prices.length-1;i++){
            if(prices[i]>sell){
                sell=prices[i];
            }
        }
        int reslt = sell-buy;
        System.out.println(reslt);
    }
}
