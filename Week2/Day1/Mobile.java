package org.testleaf.week2.day1;

public class Mobile {
   public void makeCall(){
        System.out.println("makeCall");
    }

    public void sendMessage(){
        System.out.println("sendMessage");
    }

    public void doCalculation(){
        System.out.println("doCalculation");
    }

    public static void main(String args[]){
        //System.out.println("Its from main method");
        //                    keyword
        //ClassName objectName=new ClassName();
        Mobile options=new Mobile();
        options.makeCall();
        options.sendMessage();
        options.doCalculation();

    }

}
