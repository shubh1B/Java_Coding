package com.java.Arrayscode;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[]args){
        int[]arr={1,4,6,8,9};
        int[]copyarr=new int[5];
        for(int i=0;i<arr.length;i++){
            copyarr[i]=arr[i];
        }
        System.out.println(Arrays.toString(copyarr));
    }
}
