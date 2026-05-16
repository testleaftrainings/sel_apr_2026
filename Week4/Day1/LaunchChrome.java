package org.testleaf.week4.day1;

public class LaunchChrome extends LaunchBrowser {

    public void launch(){
        super.launch();
        System.out.println("Code for Launching chrome browser");
    }

    public static void main(String[] args) {
        LaunchChrome options=new LaunchChrome();
        options.launch();

    }

}
