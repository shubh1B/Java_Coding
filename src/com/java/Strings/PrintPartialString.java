package com.java.Strings;

import java.util.Arrays;

public class PrintPartialString {
    public static void main(String[]args){
        String str="My name is shubham";
        String[]strarr=str.split(" ");
        String parstr="";
        for(int i=0;i< strarr.length-1;i++){

            parstr=parstr+strarr[i];
            if(i<strarr.length-2){
                parstr=parstr+" ";
            }

      }
        System.out.println(parstr);

    }
}
