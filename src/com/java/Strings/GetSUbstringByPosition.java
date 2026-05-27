package com.java.Strings;

public class GetSUbstringByPosition {
    public static void main(String[]args){
        String str="Black fox is so dangerous";
        System.out.println(str.substring(6,12));
        System.out.println(str.subSequence(6,12));
    }
}
