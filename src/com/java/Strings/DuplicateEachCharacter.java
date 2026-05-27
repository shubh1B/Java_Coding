package com.java.Strings;

public class DuplicateEachCharacter {

    public static void main(String[] args) {
        String str="Shubham";
        String newstr=" ";
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)=='h') {
                newstr = newstr + str.charAt(i) + str.charAt(i);
            }
            else{
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}