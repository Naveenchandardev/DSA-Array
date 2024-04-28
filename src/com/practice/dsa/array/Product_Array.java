package com.practice.dsa.array;
import java.util.Arrays;

public class Product_Array {
    public static void main(String[] args) {
        int[] nums ={-1,1,0,-3,3};
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
           if(i!=0) pro *= i;
        }
        for(int i = 0; i < n; i++) {
            if(nums[i]!=0){
                ans[i] = pro / nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
