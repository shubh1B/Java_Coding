package com.java.Revision;

public class ReverseStringWithoutCharacter {
    public static void main(String[]args){
        String str="My name is shubham";
        String[]revarr=str.split(" ");
        String rev="";
        for(int i =0;i<revarr.length;i++){
            rev=revarr[i]+rev;
            if(i< revarr.length-1){
                rev=" "+rev;
            }
                else{
                    rev=rev;
                }


        }
        System.out.println(rev);
        String rev_new="";
        for(int i=0;i<rev.length();i++){
            rev_new=rev.charAt(i)+rev_new;
        }
        System.out.println(rev_new);


    }
}
