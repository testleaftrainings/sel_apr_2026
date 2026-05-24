package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //switch the frame
        driver.switchTo().frame(0);
        //locate the element
        WebElement drag = driver.findElement(By.id("draggable"));
        //Instantiate the Actions class
        Actions act=new Actions(driver);
        act.dragAndDropBy(drag, 50, 100).perform();
    }

}
