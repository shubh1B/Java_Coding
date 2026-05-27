package com.java.Arrayscode;

import java.util.Arrays;

public class Move0toend {
    public static void main(String[] args) {

        int[] a = {0, 1, 2, 0, 0, 3, 5, 9, 0};
        int[] newarr = new int[a.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                newarr[index++] = a[i];

            }
        }
        System.out.println("index no. is"+index);
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 0) {
                    newarr[index++] = a[j];

                }


            }


        System.out.println(Arrays.toString(newarr));

    }
}







