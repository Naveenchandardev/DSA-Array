package com.practice.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[]={1,8,6,5};
        int arr2[]={7,8,2,6};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of the arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    private static int[] findIntersection(int[] a, int[] b) {
        List<Integer> intersectionList = new ArrayList<>();
        Arrays.sort(a);Arrays.sort(b);
        int i=0;int j=0;
        while(i<a.length ){
            if(a[i]==b[j]){
                intersectionList.add(a[i]);
                i++;
                j++;
            } else if (a[i]<b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        int[] intersection = new int[intersectionList.size()];
        for (int k = 0; k < intersectionList.size(); k++) {
            intersection[k] = intersectionList.get(k);
        }
        return intersection;
    }
}
