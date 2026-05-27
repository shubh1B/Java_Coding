package com.java.Arrayscode;

public class CommonElement {
    public static void main(String[]args){
        int[]a={8,4,6,8};
        int[]b={4,7,9,2};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println("common element is:"+ a[i]);
                }
            }
        }
    }
}
