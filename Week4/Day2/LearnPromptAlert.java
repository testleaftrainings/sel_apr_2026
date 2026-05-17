package org.testleaf.week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

    public static void main(String[] args) {
        //Launch the browser
         ChromeDriver driver=new ChromeDriver();

         //Load the URL
        driver.get("https://leafground.com/alert.xhtml");
        
        //Maximize the browser
        driver.manage().window().maximize();

        //Click the button to open prompt alert
        driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();

        //Switch the focus
        Alert promptAlert=driver.switchTo().alert();

        //Get the text of the alert
        String text = promptAlert.getText();
        System.out.println(text);

        //Type the text in the alert
        promptAlert.sendKeys("The alert was hansdled");

        //Accept the alert
        promptAlert.accept();

        }

}
