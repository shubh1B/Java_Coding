package com.java.Strings;

import java.util.Arrays;

public class ReverseStringWithoutCharacterreversal {
    public static void main(String[]args){
        String str="My name is Shubham";
        //output=Shubham is name My
String rev="";
String[]strarr=str.split(" ");
for(int i=0;i<strarr.length;i++){
    rev=strarr[i]+rev;
    if(i<strarr.length-1){
        rev=" "+rev;

    }
    else{
        rev=rev;
    }

}
        System.out.println(rev);


//        String finalstr="";
//        for(int i=0;i<revstr.length();i++){
//            finalstr=revstr.charAt(i)+ finalstr;
//
//        }
//        System.out.println(finalstr);



    }
}
