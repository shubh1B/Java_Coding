package com.java.Arrayscode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[]args){
        int[]s={1,3,5,7,8};
        int count=0;
        for (int i=0;i<s.length;i++){
            if(s[i]!=7){
                count++;
            }
        }
        int[]newarr=new int[count];
        int index=0;
        for(int i=0;i<s.length;i++){
            if(s[i]!=7){
                newarr[index++]=s[i];
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
