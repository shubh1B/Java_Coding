package com.java.Arrayscode;

public class DuplicateElement {
    public static void main(String[]args){
        int[]a={1,2,6,4,6,10,11,8,21};
        boolean b=false;
        for(int i=0;i<a.length;i++) {
            for (int j = i+1; j <= a.length-1 ; j++) {
                if (a[i] == a[j]) {
                    b = true;
                    System.out.println(a[i]);
                }
            }
        }
               if(b){
                   System.out.println("DUp element found");
               }
               else{
                   System.out.println("element not found");

            }


    }
}
