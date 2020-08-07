package common_methods;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class interaction_methods
{
	public void swipe(AndroidDriver<AndroidElement> driver) throws InterruptedException 
	{ 
		System.out.println("You are in Swipe method\n");
		
		Thread.sleep(3000);
		
		TouchAction swipe1 = new TouchAction(driver);
		 
		swipe1.press(PointOption.point(990,500)).waitAction().moveTo(PointOption.point(100,500)).release().perform();
	}
	
	/*public static void compare_string (AndroidDriver<AndroidElement> driver, AndroidElement locator_type, String locator_value, String text)
	{
		String value = locate_element(driver, locator_type, locator_value);
		if(value.equals(text))
		{
			System.out.println("Text is matching\n");
		}
		else
		{
			System.out.println("Text is not matching\n");
		}
	}

	private static String locate_element(AndroidDriver<AndroidElement> driver, AndroidElement locator_type, String locator_value) 
	{
		switch (locator_type)
		{
			case "id":
				
				break;
				
			case "xpath":
				
				break;
		}
		return null;
	}*/
}
