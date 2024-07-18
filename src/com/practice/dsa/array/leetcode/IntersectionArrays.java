package com.practice.dsa.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArrays {
    //https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=daily-question&envId=2024-07-02
    public static void main(String[] args) {
        int a[]={1,5,7,8,6,4};
        int b[] ={1,8,5,2};
        int[]result = solution(a,b);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] nums1, int[] nums2)  {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> intersection = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }

        return result;
    }
}
