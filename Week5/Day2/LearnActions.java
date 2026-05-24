package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //mouseHover
        WebElement mouseHover = driver.findElement(By.xpath("//span[text()='Prime']"));
        //instantiate Action class
        Actions act=new Actions(driver);
        act.moveToElement(mouseHover).perform();//perform()-->mandatory method
        //scroll down
        WebElement scrollDown = driver.findElement(By.xpath("(//h5[contains(text(),'Amazon')])[2]"));
        act.scrollToElement(scrollDown).perform();
        //click
        act.click(scrollDown).perform();
        //right click
        act.contextClick().perform();

    }

}
