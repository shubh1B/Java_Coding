package com.java.Arrayscode;

public class FIndElement {
    public static void main(String[] args) {

        int[] a = {6, 5, 10, 32, 8};
        boolean isFound = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 32) {
                isFound = true;
                break; // stop searching once found
            }
        }

        if (isFound) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number is missing");
        }
    }
}
