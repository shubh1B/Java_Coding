package com.java.Arrayscode;

public class EqualArrays {
    public static void main(String args[]){
        int[]a={1,5,6,8,4};
        int[]b={1,5,6,8,4};
        boolean c=false;
        for(int i=0;i<a.length;i++) {
            if (a[i] == b[i]) {
            c=true;
            }
        }
        System.out.println(c);
    }
}
