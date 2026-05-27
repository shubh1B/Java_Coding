package com.java.Strings;

public class StartsWithSubstrings {
    public static void main(String[]args){
        String str1="My name is shubham";
        String[]strarr=str1.split(" ");
        String first="";
        boolean b=false;
        //System.out.println(str1.startsWith("My"));
        first=strarr[0];
        System.out.println(first);

        if (first.equalsIgnoreCase("My")){
            //b=true;
            System.out.println("first char is matched");

        }
//        if(b){
//            System.out.println("first char is matched");
//        }
    }
}
