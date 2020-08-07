package capabilities;

import java.io.IOException;
import java.net.URL;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities extends Node1_Pixel2
{
	AndroidDriver<AndroidElement> driver = null;
		
	public AndroidDriver<AndroidElement> desired_capabilities(String deviceName, String version, String platform, String automationName, String app, URL url) throws JsonParseException, JsonMappingException, IOException, InterruptedException
	{		
        DesiredCapabilities cap = new DesiredCapabilities();
        
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		
		cap.setCapability(MobileCapabilityType.APP, app); 
		
		driver = new AndroidDriver<AndroidElement>(url,cap);
		
		System.out.println("App is launched\n");
		
		Thread.sleep(5000);
		
		return driver;
	}
}
