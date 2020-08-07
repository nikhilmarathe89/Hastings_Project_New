package capabilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Node2_PixelXL 
{
	public AndroidDriver<AndroidElement> json_reader_Node2(AndroidDriver<AndroidElement> driver) throws JsonParseException, JsonMappingException, IOException, InterruptedException
	{
		FileReader reader = new FileReader("D:\\Eclipse_Programs\\cucumber\\Grid\\nodeconfig_Android_PixelXL.json");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ObjectMapper mapper = new ObjectMapper();
        
        map = mapper.readValue(reader, new TypeReference<Map<String, Object>>(){});
        
        JsonElement jsonobj = new GsonBuilder().create().toJsonTree(map.get("capabilities"));
        
        Map <String,Object> mapobj= new Gson().fromJson(jsonobj,Map.class);
        
        String deviceName = (String) mapobj.get("deviceName");	
        
        String version = (String) mapobj.get("version");
        
        String platform = (String) mapobj.get("platform");
        
        String automationName = (String) mapobj.get("automationName");
        
        String app = (String) mapobj.get("app");
        
        URL url = new URL("http://192.168.1.3:4735/wd/hub");
        
        capabilities c = new capabilities();
        
        driver = c.desired_capabilities(deviceName, version, platform, automationName, app, url);
        
        return driver;
	}
}
