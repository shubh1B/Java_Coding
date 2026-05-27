package com.java.Strings;

public class RemoveDUplicateCharacter {
    public static void main(String[]args){
        String str="Michaal";
        String newstr="";
        char dup = 0;
        for(int i=0;i<str.length();i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dup = str.charAt(i);
                    System.out.println("Dup character is" + " " + dup);

                }
            }

        }
        int index=0;
                for(int k=0;k<str.length();k++){
                    if(str.charAt(k)!=dup){
                        newstr=newstr+str.charAt(k);
                    }

                }
                System.out.println(newstr);



    }
}
