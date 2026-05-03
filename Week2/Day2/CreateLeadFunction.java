package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

    public static void main(String args[]){
    //Implement ChromeOptions to open the browser in guest mode
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("guest");
      //Launch the browser
      //EdgeDriver driver=new EdgeDriver();
      
      ChromeDriver driver=new ChromeDriver(opt);

      //Load the url
      driver.get("https://leaftaps.com/opentaps/control/main");

      //Maximize the browser
      driver.manage().window().maximize();

      //Enter the username
      //find the WebElement - findElement
      WebElement usernameTextField = driver.findElement(By.id("username"));
      //Enter the value in a text field - sendkeys
      usernameTextField.sendKeys("DemoCSR");

     //Enter the password
      driver.findElement(By.id("password")).sendKeys("crmsfa");

      //Click the Login Button   -  .click()
      driver.findElement(By.className("decorativeSubmit")).click();

      //Click on the CRMSFA link
      driver.findElement(By.partialLinkText("CRM")).click();

      //Click on the Leads Link
      driver.findElement(By.linkText("Leads")).click();

      //Click on the CreateLead link
      driver.findElement(By.linkText("Create Lead")).click();

      //Enter the Companyname
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");

      //enter the firstname
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

      //Enter the lastname
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");

     //find the source dropdown
     WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

     //Step2: Create Object for Select Class
     Select sourceDD=new Select(sourceElement);

     //Step3: Using the proper method
     //By index
     //sourceDD.selectByIndex(2);   //Conference

     //By Text
     //sourceDD.selectByVisibleText("Existing Customer");

     //By Value
     sourceDD.selectByValue("LEAD_PR");


    //Click on the Submit button
      driver.findElement(By.name("submitButton")).click();

    }

}
