package com.java.Arrayscode;

public class MaxNumInArray {
    public static void main(String[] args) {
        int[] a = {2, 22, 10, 8, 1};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {


                if (a[i] > max) {
                    max = a[i];
                }
            }

        System.out.println("Max no. is"+max);
    }
}