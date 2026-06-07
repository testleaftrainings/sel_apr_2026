package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.WelcomePage;

public class RunLogin extends BaseClass{
    @Test
    public void runLog(){
        System.out.println("testMethod:"+driver);
        LoginPage lp=new LoginPage();
       lp.enteruName().enterPword().clickLogin().clickCRMSFA();

    }


}
