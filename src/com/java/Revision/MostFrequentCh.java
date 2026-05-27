package com.java.Revision;

public class MostFrequentCh {
    public static void main(String[] args) {

        String str = "sshabtuiitriis";
        int max = 0;
        int count=0;
        char ch=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }
            if(count>max){
                max=count;
                ch=str.charAt(i);

            }
            count=0;

        }
        System.out.println(ch);


    }
}
