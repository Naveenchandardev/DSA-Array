package com.practice.dsa.array;

public class PivotNumber {
    static int found =0;
    public static void main(String[] args) {
        //find pivot number;
        //i.e. find poisition's left sum equals to right sum;
        int[] array = {1, 7, 3, 6, 6};
        boolean rest = checkcondition(array);
        if(rest){
            System.out.println("Position of pivot number is  : "+found +"\n"+"pivot number is : "+array[found]);
        }
        else{
            System.out.println("There is no  pivot value");
        }
    }
    private static boolean checkcondition(int[] array) {
        int left;int right; boolean check=false;
        for (int i = 1; i < array.length - 1; i++) {
            left =0;right =0;
            found = i;
            while (i > 0) {
                left += array[i-1];
                i--;
            }
            i=found;
            while (i < array.length - 1 && right<left) {
                right += array[i+1];
                i++;
            }
            if(left==right){
                check=true;
                break;
            }
            i=found;
        }
        return check;
    }
}
