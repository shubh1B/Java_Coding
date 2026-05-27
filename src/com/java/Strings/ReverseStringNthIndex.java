package com.java.Strings;

public class ReverseStringNthIndex {
    public static void main(String[] args) {

        String str = "My name is Shubham";
        String rev = "";
        String[]strarr=str.split(" ");
//        for (int i=0;i<str.length();i++){--si eman yM Shubham
//            if(i<str.length()-8){
//                rev=str.charAt(i)+rev;
//            }
//            else{
//                rev=rev+str.charAt(i);
//            }
//        }
//        System.out.println(rev);
        for(int i=0;i< strarr.length;i++){
            if(i<strarr.length-1){
                rev=strarr[i]+rev;
            }
            else{
                rev=rev+" "+strarr[i];
            }
            if(i< strarr.length-1){
                rev=" "+rev;
            }
            else{
                rev=rev;
            }
        }
        System.out.println(rev);
    }
}