package com.java.Revision;

public class ReverseTillNthIndex {
    public static void main(String[]args){
        String str="My name is shubham";
        String[] revarr=str.split(" ");
        String rev="";
        for(int i=0;i<revarr.length;i++){
            if(i<revarr.length-1){
                rev=" "+revarr[i]+rev;
            }
            else{
                rev=rev+" "+revarr[i];
            }
        }
        System.out.println(rev);

    }
}
