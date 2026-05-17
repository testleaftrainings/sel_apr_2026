package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Load the URL
        driver.get("https://leafground.com/window.xhtml");

        //Maximize the browser
        driver.manage().window().maximize();

        //Click the button to open a new window
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        //getWindowHandle
        String parentAddress = driver.getWindowHandle();
        System.out.println("parentAddress is: "+parentAddress);
        //2C83B1F8D4CE06D531E1BC75BDB6EB3A
        //0376DE966A7FCFA84DA088988EFC5E37

        //getWindowHandles - Step1
        Set<String> allAddress = driver.getWindowHandles();
      System.out.println("allAddress is: "+allAddress);
     
      //Convert Set into List - Step2
      List<String> allStringAddress = new ArrayList<String>(allAddress);

      String titleBeforeSwitching = driver.getTitle();
      System.out.println("titleBeforeSwitching is: "+titleBeforeSwitching);

      //Switch the Driver focus from Parent to Child - Step3
      String childAddress = allStringAddress.get(1);
      driver.switchTo().window(childAddress);

      String titleAfterSwitching = driver.getTitle();
      System.out.println("titleAfterSwitching is: "+titleAfterSwitching);

      //close() and quit()
      driver.close();
      //driver.quit();

      //Switch the Driver focus from Child to Parent
      driver.switchTo().window(allStringAddress.get(0));

      String title = driver.getTitle();
      System.out.println("title is: "+title);
    }
}
