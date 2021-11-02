package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/Login.feature"},
		glue= {"StepDefination"},
		monochrome=true,
		dryRun=false,
		plugin= {
				"html:Reports/Login.html",
				"json:Reports/Login.json",
				"junit:Reports/Login.xml",
				"pretty:Reports/Login.txt"
		}
		)

public class LoginTest {

}
