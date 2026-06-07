package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features={"src/test/resources/features"},
    glue={"stepdefinition"},plugin={"pretty"},tags="@Smoke"
)
public class RunnerCucumber extends BaseClass {

}
