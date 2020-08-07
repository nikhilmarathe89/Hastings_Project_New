package common_methods;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class assertion_methods 
{	
	public boolean compare_text(AndroidDriver<AndroidElement> driver, AndroidElement locator_value, String text_to_match)
	{		
		String value = locator_value.getText();
		
		boolean match = value.equals(text_to_match);
		
		if(match==true)
		{
			return match;
		}
		else
		{
			return match;
		}
	}
}

