package elements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class element_details
{
	public element_details(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(id = "fragment_alert_dialog_negative")
	public AndroidElement continue_cta;
	
	@AndroidFindBy(id = "fragment_tutorial_background")
	public AndroidElement tut_background;
	
	@AndroidFindBy(id = "fragment_tutorial_title")
	public AndroidElement tut_title;
	
	@AndroidFindBy(id = "fragment_tutorial_information")
	public AndroidElement tut_desc;
	
	@AndroidFindBy(id = "fragment_tutorial_page_close")
	public AndroidElement get_started;
	
	@AndroidFindBy(id = "fragment_terms_conditions_accepted")
	public AndroidElement terms_condition;
	
	@AndroidFindBy(id = "fragment_first_login_login")
	public AndroidElement login;
	
	@AndroidFindBy(id = "widget_email_input_edit")
	public AndroidElement email_id;
	
	@AndroidFindBy(id = "fragment_email_login_continue")
	public AndroidElement email_continue;
	
	@AndroidFindBy(id = "widget_dob_input_day")
	public AndroidElement day_birth;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='01']")
	public AndroidElement select_day;
	
	@AndroidFindBy(id = "fragment_date_picker_positive")
	public AndroidElement date_picker_ok;
		
	@AndroidFindBy(id = "widget_dob_input_month")
	public AndroidElement month_birth;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Jan']")
	public AndroidElement select_month;
	
	@AndroidFindBy(id = "widget_dob_input_year")
	public AndroidElement year_birth;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='2002']")
	public AndroidElement select_year;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='']")
	public AndroidElement select_year_null;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='1980']")
	public AndroidElement select_year_new;
	
	@AndroidFindBy(id = "fragment_dob_login_continue")
	public AndroidElement dob_continue;
	
	@AndroidFindBy(id = "widget_password_input_edit")
	public AndroidElement password;
	
	@AndroidFindBy(id = "fragment_password_login_continue")
	public AndroidElement pass_continue;
	
	@AndroidFindBy(id = "fragment_quick_login_skip")
	public AndroidElement pin_skip;
	
	@AndroidFindBy(id = "fragment_alert_dialog_positive_primary")
	public AndroidElement pin_skip_ok;
	
	@AndroidFindBy(id = "fragment_continue_as_corona")
	public AndroidElement corona_continue;
}
