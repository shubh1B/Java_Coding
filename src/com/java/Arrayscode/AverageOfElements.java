package com.java.Arrayscode;

public class AverageOfElements {
    public static void main (String[]args){
        int[]a={3,6,8,9,4};
        int sum=0;
        for(int i=0;i<5;i++){
           sum=sum+a[i];
        }
        int avg=sum/a.length;
        System.out.println(avg);

    }
}
