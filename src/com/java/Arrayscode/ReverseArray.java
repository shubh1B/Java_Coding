package com.java.Arrayscode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[]args){
//        int[]a={3,5,8,1,5};
//        int[]rev=new int[5];
//        int j=0;
//        for(int i=a.length-1;i>=0;i--){
//            for(;j<rev.length;j++){
//                rev[j]=a[i];
//                j++;
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(rev));


                int[] a = {3, 5, 8, 1, 5};
                int[] rev = new int[a.length];

                for (int i = 0; i < a.length; i++) {
                    rev[a.length - 1 - i] = a[i];
                }

                System.out.println(Arrays.toString(rev));
            }


    }

