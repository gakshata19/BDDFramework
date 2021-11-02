package StepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCRM extends BaseClass{

	@Given("User launch CRM browser")
	public void user_launch_crm_browser() {
			BaseClass.initializaion();
	    	}
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("gakshata19@gmail.com");;
	    driver.findElement(By.name("password")).sendKeys("Aksh$123");;
	}
	@Then("user click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	@Then("User is on homepage")
	public void user_is_on_homepage() {
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/span[1]")).getText());
	}
	@Then("close browser")
	public void close_browser() throws InterruptedException {
	    Thread.sleep(2000);
		driver.close();
	}
}
