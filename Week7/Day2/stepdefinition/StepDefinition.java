package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

    

//     @Given("Launch the Browser and Load the url")
// public void launch_the_browser_and_load_the_url() {
//      driver=new ChromeDriver();
//     driver.get("https://leaftaps.com/opentaps/control/main");
// }
@When("Enter the Username {string}")
public void enter_the_username(String uName) {
    driver.findElement(By.id("username")).sendKeys(uName);
    
}
@When("Enter the password {string}")
public void enter_the_password(String pwd) {
    driver.findElement(By.id("password")).sendKeys(pwd);
   
}
@When("click on Login button")
public void click_on_login_button() {
    driver.findElement(By.className("decorativeSubmit")).click();
}
@When("click on login button")
public void click_on_login_button1() {
    driver.findElement(By.className("decorativeSubmit")).click();
}
@Then("HomePage is displayed")
public void home_page_is_displayed() {
    String title=driver.getTitle();
    if(title.contains("Leaftaps")){
        System.out.println("welcome page is dispalyed");
    }else{
        System.out.println("welcome page is not dispalyed");
    }
}
@When("Error msg is displayed")
public void error_msg_is_displayed() {
    String text = driver.findElement(By.id("errorDiv")).getText();
    if (text.contains("Errors")) {
        System.out.println("error msg is displayed");
    }else{
        System.out.println("error msg is not displayed");
    }
}

}
