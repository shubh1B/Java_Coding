package com.java.Arrayscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayList {
    public static void main(String[]args){
//        String[]a={"a","b","c"};
//        conveert Array to list
//        List<String> s=new ArrayList<String>(Arrays.asList(a));
//        System.out.println(s);
        int[]a={2,4,6};
        List<Integer> s=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        System.out.println(s);
        System.out.println(Arrays.toString(a));
    }

}
