package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
    /*checks for No suchelement exception:
    1)check for the locator
    2)check for the wit statements
    3)check whether the element is present inside  aframe
     */

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //transfer my driver focus to the frame
        driver.switchTo().frame(0);
        //click
        driver.findElement(By.id("Click")).click();

    }

}
