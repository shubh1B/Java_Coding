package com.java.Strings;

import java.util.Arrays;

public class PrintCharacterArray {
    public static void main(String[]args){
        String str="Shubham";
//        char[]ch=str.toCharArray();
//        System.out.println(ch[6]);
String[]arr=str.split("");
System.out.println(Arrays.toString(arr));
    }
}
