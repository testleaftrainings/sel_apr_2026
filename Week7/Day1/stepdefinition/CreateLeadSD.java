package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass {

@When("click on crmsfa button")
public void click_on_crmsfa_button() {
    driver.findElement(By.linkText("CRM/SFA")).click();
}
@When("click on LeadsLink")
public void click_on_leads_link() {
    driver.findElement(By.linkText("Leads")).click();
    
}
@When("click on CreateleadLink")
public void click_on_createlead_link() {
    driver.findElement(By.linkText("Create Lead")).click();
}
@When("Enter the companyName (.*)$")
public void enter_the_company_name(String cName) {
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
}
@When("Enter the firstName (.*)$")
public void enter_the_first_name(String fName) {
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
   
}
@When("Enter the lastName (.*)$")
public void enter_the_last_name(String lName) {
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
}
@When("Click on SubmitButton")
public void click_on_submit_button() {
    driver.findElement(By.name("submitButton")).click();
}
@Then("ViewLeadsPage is displayed")
public void view_leads_page_is_displayed() {
    String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    if (text.contains("Saranya")) {
        System.out.println("viewLeads page is displayed");
        
        }
        else {
            System.out.println("viewLeads page is not displayed");
    }
}


}
