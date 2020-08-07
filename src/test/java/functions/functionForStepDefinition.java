package functions;
import java.io.IOException;
import java.net.MalformedURLException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import common_methods.assertion_methods;
import common_methods.interaction_methods;

import capabilities.Node1_Pixel2;
import elements.element_details;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class functionForStepDefinition extends assertion_methods
{
	AndroidDriver<AndroidElement> driver;
	
	element_details element;
	
	interaction_methods common = new interaction_methods();
	
	assertion_methods asserts = new assertion_methods();
	
	public AndroidDriver<AndroidElement> base_capabilities(AndroidDriver<AndroidElement> driver) throws JsonParseException, JsonMappingException, IOException, InterruptedException
	{	
		Node1_Pixel2 cap1 = new Node1_Pixel2();
		
		driver = cap1.json_reader_Node1(driver);
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> tutorials(AndroidDriver<AndroidElement> driver) throws MalformedURLException, InterruptedException
	{
		int i = 0;
		//String title;
		//String description;
		
		Thread.sleep(3000);
		
		System.out.println("You are in Tutorial method\n");
		
		element = new element_details(driver);
		
		element.continue_cta.click(); // clicks on Continue cta when app launches
		
		System.out.println("Continue cta identified and clicked\n" );
				
		Thread.sleep(3000);
		
		if(element.tut_background.isDisplayed())
		{
			while(element.tut_background.isDisplayed()) // matches element and swipes pages
			{				
				System.out.println("Details of page " + ++i + " :\n ");
				
				Thread.sleep(3000);
				
				//title = element.tut_title.getText();
				//System.out.println("Title : \n" + title + "\n");
				
				//description = element.tut_desc.getText();
				//System.out.println("Description : \n" + description + "\n");
				
				String page1_t = "Keeping you \nin control";
				String page1_d = "With simple swipe controls you can instantly access two important features from any page in the app. Just swipe left to launch live chat or swipe right to open the main menu.";
				
				String page2_t = "Keeping you \nsecure";
				String page2_d = "Use your MyAccount password or create a PIN to safely access your details.";
				
				String page3_t = "Keeping you \ninformed";
				String page3_d = "In just a few clicks you can find useful information such as your policy numbers, documents, summary of what you're covered for, excesses and renewal dates.";
				
				String page4_t = "Keeping your details up to date";
				String page4_d = "It's quick and easy to update your policy information. You can change your car, address or add a new driver in a few simple steps.";
				
				String page5_t = "Keeping you \nin touch";
				String page5_d = "24/7 access to claims information – contact details and frequently asked questions are all available if the worst should happen.";
				
				String page6_t = "Keeping you \nmoving";
				String page6_d = "Help is at your fingertips - click and call our breakdown provider to keep you on the road.";
								
				boolean p1_title = asserts.compare_text(driver, element.tut_title, page1_t);
				
				boolean p1_desc = asserts.compare_text(driver, element.tut_desc, page1_d);
				
				boolean p2_title = asserts.compare_text(driver, element.tut_title, page2_t);
				
				boolean p2_desc = asserts.compare_text(driver, element.tut_desc, page2_d);
				
				boolean p3_title = asserts.compare_text(driver, element.tut_title, page3_t);
				
				boolean p3_desc = asserts.compare_text(driver, element.tut_desc, page3_d);
				
				boolean p4_title = asserts.compare_text(driver, element.tut_title, page4_t);
				
				boolean p4_desc = asserts.compare_text(driver, element.tut_desc, page4_d);
				
				boolean p5_title = asserts.compare_text(driver, element.tut_title, page5_t);
				
				boolean p5_desc = asserts.compare_text(driver, element.tut_desc, page5_d);
				
				boolean p6_title = asserts.compare_text(driver, element.tut_title, page6_t);
				
				boolean p6_desc = asserts.compare_text(driver, element.tut_desc, page6_d);
				
				if(p1_title == true && p1_desc == true) // checks the page 1 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 1\n");
					
					common.swipe(driver);
					
					System.out.println("---------------------------------------------------------------------------------------------\n\n");
				}
				
				if(p2_title == true && p2_desc == true) // checks the page 2 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 2\n");
				
					common.swipe(driver); 
					
					System.out.println("---------------------------------------------------------------------------------------------\n\n");
				}
				
				if(p3_title == true && p3_desc == true) // checks the page 3 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 3\n");
				
					common.swipe(driver);
					
					System.out.println("---------------------------------------------------------------------------------------------\n\n");
				}
				
				if(p4_title == true && p4_desc == true) // checks the page 4 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 4\n");
				 
					common.swipe(driver); 
					
					System.out.println("---------------------------------------------------------------------------------------------\n\n");
				}
				
				 
				if(p5_title == true && p5_desc == true) // checks the page 5 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 5\n");
				 
					common.swipe(driver); 
					
					System.out.println("---------------------------------------------------------------------------------------------\n\n");
				}
				 
				if(p6_title == true && p6_desc == true) // checks the page 6 of tutorial page
				{
					Thread.sleep(3000);
					
					System.out.println("Title and description is matching of Tutorial page 6\n");
				 
					System.out.println("You are on Last Tutorial page\n\n");
				 
					break; 
				}
			}
		
			Thread.sleep(3000);
			
			element.get_started.click(); // clicks on get started on Last Tutorial page
		
			Thread.sleep(3000);
		
			element.terms_condition.click(); // clicks on Terms and Conditions cta
		}
		else
		{
			System.out.println("Tutorial and Terms and Condition pages are not displayed\n");
		}
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> login_register(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		element = new element_details(driver);
		
		Thread.sleep(3000);
		
		element.login.click(); // clicks on Log In cta
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> emailID(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		
		element = new element_details(driver);
		
		Thread.sleep(2000);
		
		element.email_id.sendKeys("Expl01@yopmail.com"); // Enters email id
		
		System.out.println("You have entered 'Expl01@yopmail.com' as your email address\n");
		
		Thread.sleep(3000);
		
		element.email_continue.click(); // click on next when email id is entered
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> dateOfBirth(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		Thread.sleep(2000);
		
		element = new element_details(driver); // clicks on Day
		
		element.day_birth.click();
		
		Thread.sleep(2000);
		
		element.select_day.click(); // selects the date
		
		Thread.sleep(2000);
		
		element.date_picker_ok.click(); // clicks on OK when date is selected
		
		Thread.sleep(2000);
		
		element.month_birth.click(); // clicks on Month
		
		Thread.sleep(2000);
		
		element.select_month.click(); // selects the month
		
		Thread.sleep(2000);
		
		element.date_picker_ok.click(); // clicks on OK when month is selected
		
		Thread.sleep(2000);
		
		element.year_birth.click(); // clicks on Year
		
		Thread.sleep(2000);
		
		//AndroidElement year = element.select_year; 
		
		element.select_year.click(); // selects the year
		
		Thread.sleep(2000);
		
		element.select_year.clear(); // clears the year field
		
		Thread.sleep(2000);
		
		element.select_year_null.sendKeys("1980"); // enters value "1980"
		
		Thread.sleep(2000);
		
		element.select_year_new.click(); // clicks on year field
		
		Thread.sleep(2000);
		
		element.date_picker_ok.click(); // clicks on OK when year is selected
		
		Thread.sleep(2000);
		
		System.out.println("You have entered DOB as '01/01/1980'\n");
		
		Thread.sleep(2000);
		
		element.dob_continue.click(); // clicks on Continue when date of birth is entered
		
		Thread.sleep(2000);
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> password(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		Thread.sleep(2000);
		
		element = new element_details(driver);
		
		element.password.sendKeys("Test12345"); // enters password as "Test12345"
		
		Thread.sleep(2000);
		
		System.out.println("You have entered 'Test12345' as your password\n");
		
		Thread.sleep(2000);
		
		element.pass_continue.click(); // clicks on continue when password is entered
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> pinSetup(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		Thread.sleep(30000);
		
		element = new element_details(driver);
		
		element.pin_skip.click(); // clicks on skip cta
		
		Thread.sleep(3000);
		
		element.pin_skip_ok.click(); // clicks on OK to set PIN later
		
		System.out.println("You have skipped to set PIN\n");
		
		return driver;
	}
	
	public AndroidDriver<AndroidElement> corona_update(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		Thread.sleep(10000);
		
		element = new element_details(driver);
		
		element.corona_continue.click(); // clicks on Continue on corona virus update page
		
		Thread.sleep(3000);
		
		element.corona_continue.click(); // Again clicks on Continue on corona virus update page, which appear for 2nd time
		
		System.out.println("You have read the Corona virus update details\n");
		
		return driver;
	}
	
	public void homepage()
	{
		System.out.println("Homepage is displayed");
	}
}
