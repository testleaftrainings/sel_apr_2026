package org.testleaf.week3.day2;

public class ChildClass extends ParentClass {

public void method2(){
    System.out.println("method2");
}
public static void main(String[] args) {
       ChildClass cc=new ChildClass();
        cc.method2();
        cc.method1();
    }

}
