package com.uiFramework.prive.slyaws.helper.browserConfiguration;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.uiFramework.prive.slyaws.helper.resource.ResourceHelper;



/**
 * 
 * @author Devesh Dobriyal
 *
 */
public class ChromeBrowser {
public static WebDriver driver;
	public ChromeOptions getChromeOptions() throws MalformedURLException {
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--test-type");
		//option.addArguments("--disable-popup-blocking");
		//option.addArguments("--disable-infobars");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		//chrome.setBrowserName("Chrome");
		//chrome.setJavascriptEnabled(true);
		chrome.setPlatform(Platform.ANY);
		
		option.setCapability(ChromeOptions.CAPABILITY, chrome);	
		
		/*URL url = new URL("http://10.60.208.143:4444/wd/hub");
		driver = new RemoteWebDriver(url, chrome);*/
		
		//Linux
		if(System.getProperty("os.name").contains("Linux")){
			option.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return option;
	}

	public WebDriver getChromeDriver(ChromeOptions cap) throws MalformedURLException {

		if (System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("src/main/resources/drivers/chromedriver"));
			return new ChromeDriver(cap);
		}
		else if(System.getProperty("os.name").contains("Window")){
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("//grid//chromedriver.exe")); // \\src\\main\\java\\com\\uiFramework\\prive\\slyaws\\helper\\resource\\drivers\\chromedriver.exe
			URL url = new URL("http://10.60.208.143:4444/wd/hub");
			driver = new RemoteWebDriver(url, cap);
			return driver;
			//return new ChromeDriver(cap);
		}
		else if(System.getProperty("os.name").contains("Linux")){
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chrome");
			return new ChromeDriver(cap);
		}
		return null;
	}
	
	/*public static void main(String[] args) {
		ChromeBrowser obj = new ChromeBrowser();
		WebDriver driver = obj.getChromeDriver(obj.getChromeOptions());
		driver.get("https://www.zomato.com/bangalore/punjabi-nawabi-hsr/order/LoqDdXx");
	}*/

}
