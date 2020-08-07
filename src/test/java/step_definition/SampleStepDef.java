package step_definition;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;

import functions.functionForStepDefinition;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStepDef extends functionForStepDefinition
{	
	functionForStepDefinition common = new functionForStepDefinition();
	
	AndroidDriver<AndroidElement> driver;
	
	//element_details element = new element_details(driver);
	
	@Given("User is on app launch screen")
	public void user_is_on_app_launch_screen() throws InterruptedException, IOException, ParseException 
	{
		driver = common.base_capabilities(driver);
	}

	@When("User checks the Tutorial pages and click on Accept and Continue screen")
	public void user_checks_the_tutorial_pages_and_clicks_on_get_started() throws InterruptedException, MalformedURLException 
	{
		driver = common.tutorials(driver);
	}

	@Then("Login and Register page is displayed")
	public void login_and_register_page_is_displayed() throws InterruptedException 
	{
		driver = common.login_register(driver);
	}

	@Then("user enters email id and click on Next")
	public void user_enters_email_id_and_click_on_next() throws InterruptedException 
	{
		driver = common.emailID(driver);
	}

	@Then("user enter date of birth and click on Next")
	public void user_enter_date_of_birth_and_click_on_next() throws InterruptedException 
	{		
		driver = common.dateOfBirth(driver);
	}

	@Then("user enters password and click on login")
	public void user_enters_password_and_click_on_login() throws InterruptedException 
	{
		driver = common.password(driver);
	}

	@Then("user clicks on skip and continue to set PIN later")
	public void user_clicks_on_skip_and_continue_to_set_pin_later() throws InterruptedException 
	{
		driver = common.pinSetup(driver);
	}

	@Then("Coronavirus update page is displayed and user clicks on Continue")
	public void coronavirus_update_page_is_displayed_and_user_clicks_on_continue() throws InterruptedException 
	{
		driver = common.corona_update(driver);
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() 
	{
		common.homepage();
	}
}
