package com.java.Arrayscode;

public class EvenAndOdd {
    public static void main(String[]args){
        int[]a={2,4,3,7,8,9};
        int ecount=0;
        int ocount=0;
        int rem=0;
        for(int i=0;i<a.length;i++){
            rem=a[i]%2;
            if(rem==0){
                ecount++;
                System.out.println(a[i]+"is even number");
            }
            else {
                ocount++;
                System.out.println(a[i]+"is odd number");
            }
        }
        System.out.println("even number count is:"+" "+ecount);
        System.out.println("odd number count is:"+" "+ocount);
    }
}
