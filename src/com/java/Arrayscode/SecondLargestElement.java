package com.java.Arrayscode;

public class SecondLargestElement {
    public static void main(String[]args){
        int[]a={6,8,4,10,12};
        int lar=a[0];
        int slar=a[0];
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>lar){
                lar=a[i];
            }
        }
        System.out.println(lar);
        for(int i=0;i<a.length;i++){
            if(a[i]!=lar){
                count++;

            }
        }
        int[]newarr=new int[count];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=lar){
                newarr[index]=a[i];
            }

        }
        for(int i=0;i<newarr.length;i++){
            if(newarr[i]>slar){
                slar=newarr[i];
            }
        }
        System.out.println("Second largest is :"+" "+slar);

    }
}
