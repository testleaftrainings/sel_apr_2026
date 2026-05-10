package org.testleaf.week3.day2;

//IPhone is type of Mobile
//          ChildClass extends ParentClass
//Parent,BaseClass,SuperClass
//Child, SubClass , InheritedClass

public class Iphone extends Mobile {
   public void takeHQPhoto(){
        System.out.println("takeHQPhoto");
    }

public static void main(String[] args) {
        Iphone iphoneOptions=new Iphone();
        iphoneOptions.makeCall();
        iphoneOptions.takeHQPhoto();
    }
}
