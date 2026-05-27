package com.java.OOPS;

interface I1 {
    public static final int a =15;
    private void roll(){
        System.out.println(12);
    }
    public abstract void printname();
    default void name(){
        System.out.println("actual name");
    }
}
class interchild implements I1{

     public void printname() {
        System.out.println("Ram");
    }
   // private void roll(){}--private method
//    public void name(){
//         System.out.println("overriden name");
//    }
public void sum(){
       System.out.println("sum");
   }


}

    public class PracticeInter {
        public static void main(String[] args) {
            interchild c = new interchild();
            c.printname();
            c.name();

           System.out.println(I1.a);
           I1 c1=new interchild();
           c1.name();
          // c1.sum()---not allowed


        }
    }
