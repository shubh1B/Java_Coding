package com.java.Strings;

public class ReverseCharacterWithoutStatementreversal {
    public static void main(String[] args) {

//        String str = "My name is shubham";
//        //output-yM eman si mahbuhS
//        String rev="";
//        String revstr="";
//        String[]strarr=str.split(" ");
//
//        for(int i=0;i<strarr.length;i++){
//            rev=strarr[i]+rev;
//            if(i<strarr.length-1){
//                rev=" "+rev;
//            }
//            else {
//                rev = rev;
//            }
//        }
//        System.out.println(rev);
//
//        for(int i=0;i<rev.length();i++){
//revstr=rev.charAt(i)+revstr;
//        }
//
//
//        System.out.println(revstr);
        String str = "My name is shubham";
        String[] newarr = str.split(" ");
        String rev="";
        String revstr="";
        for(int i=0;i< newarr.length;i++){
            rev=newarr[i]+rev;
            if(i<str.length()-1){
                rev=" "+rev;
            }
            else{
                rev=rev;
            }
        }
        System.out.println(rev);
        for(int i=0;i<rev.length();i++){
            revstr=rev.charAt(i)+revstr;
        }
        System.out.println(revstr);
    }
}