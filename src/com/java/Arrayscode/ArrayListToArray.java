package com.java.Arrayscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[]args){

        //List<String> s=new ArrayList<>(Arrays.asList("a","b","c"));
        //System.out.println(s);
//        List<String>s=new ArrayList<>();
//        s.add("a");
//        s.add("b");
//        s.add("c");
//        String[]arr=new String[s.size()];
//        s.toArray(arr);
//        //print array
//        System.out.println(Arrays.toString(arr));
        List<Integer>s=new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        int[]arr=new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            arr[i] = s.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
