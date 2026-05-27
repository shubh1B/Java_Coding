package com.java.OOPS;


    abstract class TryAbstract {
        public abstract void printname();
        public void printRoll() {
            System.out.println(12);
        }

    }

    class child extends TryAbstract {
        public void printname() {
            System.out.println("Shubham");
        }
    }
public class Practiceabs {
    public static void main(String[] args) {
child c =new child();
c.printname();

    }}
