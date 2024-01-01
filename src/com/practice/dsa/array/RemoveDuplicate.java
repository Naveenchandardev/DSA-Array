package com.practice.dsa.array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main (String[] args){
        Integer [] input1= {1,5,3,3,18,5,6,8,9,7};
//METHOD:1-remove duplicate using set && stream;
        Arrays.stream(input1).collect(Collectors.toSet()).forEach(x-> System.out.print(" "+x));
        System.out.println();

//METHOD:2 -remove duplicate USING set;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int element : input1) {
            set.add(element);
        }
        System.out.println("set values: "+set);

        int[] arrayWithoutDuplicates = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Method2 result: "+Arrays.toString(arrayWithoutDuplicates));
        System.out.println();
//METHOD 3: sorting and remove duplicate
        int  [] input2 = {1,5,3,3,18,5,6,8,9,7};
        int [] result =Arrays.stream(input2).boxed().distinct().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));            
    }
}
