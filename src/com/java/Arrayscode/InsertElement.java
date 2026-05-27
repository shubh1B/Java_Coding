package com.java.Arrayscode;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[]args){
        /*int[]arr={2,3,6,8,9};
        int newval=10;
        int index=2;
        int[]newarr=new int[arr.length+1];
        for(int i=0;i<index;i++){
            newarr[i]=arr[i];
        }
        newarr[index]=newval;
        for(int i=index;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));*/
        int[]a={2,4,6,8,10};
        int newval=3;
        int index=3;
        int[]b=new int[a.length+1];
        for(int i=0;i<index;i++){
            b[i]=a[i];
        }
        b[index]=newval;
        for(int i=index;i<a.length;i++){
            b[i+1]=a[i];
        }
        System.out.println(Arrays.toString(b));

    }
}
