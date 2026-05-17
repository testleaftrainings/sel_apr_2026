package org.testleaf.week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinksInAWebpage {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Load the URL
        driver.get("https://www.facebook.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //To print the first link in the webpage
        WebElement element = driver.findElement(By.tagName("a"));
        System.out.println("element is : "+element);
        String text = element.getText();
        System.out.println("text is : "+text);

        //To count the number of links
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //  0    1   2                       32
        // [we1,we2,we3,,,,,,,,,,,,,,,,,,,,we33]
        //System.out.println("allLinks is : "+allLinks);
        int size=allLinks.size();
        //0   1   2   3   ...............   32
        for(int i=0;i<=size-1;i++){
            String allValues=allLinks.get(i).getText();
            System.out.println("allValues is : "+allValues);
            //String allValues=allLinks.get(0).getText();
            //String allValues=allLinks.get(1).getText();
            //String allValues=allLinks.get(32).getText();
        }
    }

}
