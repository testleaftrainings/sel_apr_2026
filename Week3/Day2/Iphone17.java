package org.testleaf.week3.day2;

public class Iphone17 extends Iphone {

    public void useAI(){
        System.out.println("useAI");
    }

    public static void main(String[] args) {
        Iphone17 iphoneOptions=new Iphone17();
        iphoneOptions.useAI();
        iphoneOptions.makeCall();
    }
}
