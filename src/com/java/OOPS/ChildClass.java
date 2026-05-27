package com.java.OOPS;

public class ChildClass extends BaseInheritance{

    public ChildClass(){
        super();
    }

//    public void name(){
//        System.out.println("overriden name");
//
//    }
    public void sum(){
        System.out.println("sum");
    }

    public static void main(String[]args){
       ChildClass c=new ChildClass();
//        c.name();
//       String name= c.callid();
//       System.out.println(name);
//        callstatic();


        BaseInheritance b=new ChildClass();
       // ChildClass cobj=new BaseInheritance();--not allowed
        b.name();




        c.sum();
       // b.sum();----not allowed
       int num= c.a;
        BaseInheritance b1=new BaseInheritance();
       int num1= b1.a;



System.out.println(num);
/* if child pbject & parent reference then only parent methods & overriden parent methods
in child class can be called
parent object & child reference not allowed
parent reference & parent object-only parent methods can be called
Child reference & CHild object-Parent overriden methods,parent methods ,Child methods can be called
 */



    }


}
