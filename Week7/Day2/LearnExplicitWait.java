package week7.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().window().maximize();
        //click open
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        //noofWindows
        Set<String> windowHandles = driver.getWindowHandles();
        int noOfWindows = windowHandles.size();
        System.out.println(noOfWindows);//3 since the size starts from 1
        //instantiate the WebdriverWait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(until);
    }

}
