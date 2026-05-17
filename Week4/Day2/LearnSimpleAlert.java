package org.testleaf.week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Load the URL
        driver.get("https://leafground.com/alert.xhtml");

        //Maximize the browser
        driver.manage().window().maximize();

        //Click the button to open simple alert
        driver.findElement(By.xpath("//span[text()='Show']")).click();

         //driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();

         //Switching to alert box
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
    }

}
