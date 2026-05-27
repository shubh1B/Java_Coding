package com.java.Strings;

public class PrintAllCharacters {
    public static void main(String[]args){
        String str="My name is shubham";
        for(int i=0;i<str.length();i++){
            System.out.println("Char at"+i+":"+str.charAt(i));
        }
    }
}
