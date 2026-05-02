package org.testleaf.week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
    public static void main(String[] args) {
        //Step1: Launch the Browser
        //ChromeBrowser - ChromeDriver
        ChromeDriver driver=new ChromeDriver();

        //EdgeDriver driver=new EdgeDriver();

        //Step2: Load the url - get() --> ChromeDriver class
        driver.get("https://www.facebook.com/");

        //step3: Maximize the browser
        driver.manage().window().maximize();
    }

}
