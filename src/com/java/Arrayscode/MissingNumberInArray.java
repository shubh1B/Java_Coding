package com.java.Arrayscode;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // range is 1..6

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

