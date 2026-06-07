package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //to take the screenshot
        File src = driver.getScreenshotAs(OutputType.FILE);
        //destination
        File dest=new File("./snaps/homepage.png");
        //connect source and destination
        FileUtils.copyFile(src, dest);

    }

}
