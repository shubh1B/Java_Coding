package com.java.Strings;

public class ReverseStringStatement {
    public static void main(String[]args){
        String str="My name is shubham";
        String rev="";
        //output-mahbuhs si eman yM
       for(int i=0;i<str.length();i++) {
       rev=str.charAt(i)+rev;
       }
       System.out.println(rev);
    }
}
