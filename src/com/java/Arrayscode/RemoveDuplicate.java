package com.java.Arrayscode;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[]args){
        /*int[]a={1,7,2,8,2};
        int count=0;
        int dup = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                     dup=a[i];
                    System.out.println("Dup no. is"+dup);
                    System.out.println("Dup index1:"+i);
                    System.out.println("Dup index2:"+j);

                }
            }
        }
        for(int k=0;k<a.length;k++){
            if(a[k]!=dup){
                count++;
            }
        }
        int[]newarr=new int[count];
        int index=0;
        //1,7,2,8,2
        for(int l=0;l<a.length;l++){
            if(a[l]!=dup){
                newarr[index++]=a[l];
            }
        }
        System.out.println(Arrays.toString(newarr));*/
        int[]a={1,4,6,8,4,10};
        int dup=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j && a[i]==a[j]){
                    dup=a[i];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=dup){
                count++;
            }
        }
        int[] newarr=new int[count];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=dup){
                newarr[index++]=a[i];
            }
        }
        System.out.println(Arrays.toString(newarr));

    }

}
