package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //handle the outerframe
        WebElement nestFrame = driver.findElement(By.xpath("//h5[contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
        driver.switchTo().frame(nestFrame);
        
        //hande the inner frame
        //driver.switchTo().frame("frame2");
        driver.switchTo().frame(0);//no such frame exception
        //click
        driver.findElement(By.id("Click")).click();

        driver.switchTo().defaultContent();//when need come out of all the frames
        driver.switchTo().parentFrame();//switch to the immediate parent frame
    }

}
