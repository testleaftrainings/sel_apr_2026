package org.testleaf.week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LearnSweetAlert {
    public static void main(String[] args) {

        //Launch the browser
         ChromeDriver driver=new ChromeDriver();

         //Load the URL
        driver.get("https://leafground.com/alert.xhtml");

        //Maximize the browser
        driver.manage().window().maximize();

        //Click the button to open sweet alert
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();

        //Click the button to open sweet alert with confirm and cancel
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        
    }

}
