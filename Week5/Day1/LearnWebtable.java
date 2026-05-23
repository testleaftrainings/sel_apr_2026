package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/table.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //locate the table
        WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
        //rowCount
        List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
        int size = rowCount.size();
        System.out.println(size);
        //coumnCount
        List<WebElement> columnCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
        System.out.println(columnCount.size());
        //retrieve single data
        String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);
        //retrieve a single row
        List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[4]"));
        
        for (WebElement iterator : singleRow) {
            System.out.println(iterator.getText());
        }

        //dynamic webtable

        for (int i = 1; i < rowCount.size() ; i++) {
            System.out.println("----------------------");
            for (int j = 1; j < columnCount.size(); j++) {
                WebElement dynmicData = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
                System.out.println(dynmicData.getText());
            }
        }

    }

}
