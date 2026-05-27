package com.java.Strings;

public class EndWithSpecificString {
    public static void main(String[]args){
        String str="Shubhsh";
        String act="";
        String exp="am";
        String first="";
        boolean b=false;
        for(int i=0;i<str.length();i++){
            if(i>str.length()-3){
                act=act+str.charAt(i);
            }
            if(i<2){
                first=first+str.charAt(i);

            }
        }
        System.out.println("first 2letter:"+first);
        System.out.println(act);
//        if(act.equals(exp)){
//            b=true;
//        }
//        if(b){
//            System.out.println(act);
//        }
//        else{
//            System.out.println("Value mismatched");
//        }
        if(act.equalsIgnoreCase(first)){
            b=true;
        }
        if(b){
            System.out.println(act);
            System.out.println(first);
        }
        else{
            System.out.println("Value mismatched");
        }
    }
}
