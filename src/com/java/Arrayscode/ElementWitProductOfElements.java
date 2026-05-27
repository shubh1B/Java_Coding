package com.java.Arrayscode;

import java.util.Arrays;

public class ElementWitProductOfElements {
    public static void main(String[]args){
        /*int[]a={1,2,3,4,5,6,7};
        int[]newarr=new int[a.length];
        int index=0;
        int product=1;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if(i!=j)
                    product = product * a[j];

                newarr[i] = product;
            }
            product =1;
        }
        System.out.println(Arrays.toString(newarr));*/
        int[]a={1,2,3,4,5,6,7};
        int[]newarr=new int[a.length];

        int product = 1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    product=product*a[j];
                    newarr[i]=product;
                }
            }
            product=1;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
