package com.java.Arrayscode;

import java.util.Arrays;

public class Separate0And1 {
    public static void main(String[]args){
        int[]a={1,1,0,0,1,0,1,0};
        int[]newarr=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == 0) {
                newarr[index] = a[i];
                index=index+1;
            }
//            index=index++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                newarr[index++]=a[i];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
