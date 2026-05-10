package org.testleaf.week3.day2;

public class Iphone16 extends Iphone{

    public void useChatGpt(){
        System.out.println("useChatGpt");
    }
    public static void main(String[] args) {
        Iphone16 iphoneOptions =new Iphone16();
        iphoneOptions.useChatGpt();
        iphoneOptions.makeCall();
    }
}
