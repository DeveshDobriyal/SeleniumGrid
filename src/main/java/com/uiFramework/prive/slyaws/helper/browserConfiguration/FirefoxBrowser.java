package com.uiFramework.prive.slyaws.helper.browserConfiguration;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.uiFramework.prive.slyaws.helper.resource.ResourceHelper;


public class FirefoxBrowser {
	WebDriver driver;
	public FirefoxOptions getFirefoxOptions() throws MalformedURLException {

		DesiredCapabilities firefox = DesiredCapabilities.firefox();
		//firefox.setBrowserName("Firefox");
		firefox.setPlatform(Platform.ANY);
		//firefox.setCapability("marionette", true);
		
		/*FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);*/
		
		firefox.setCapability(FirefoxDriver.PROFILE, firefox);
		
		URL url = new URL("http://10.60.208.143:4444/wd/hub");
		driver = new RemoteWebDriver(url, firefox);
		
		FirefoxOptions firefoxOptions = new FirefoxOptions(firefox);
		/*// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			firefoxOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return firefoxOptions;*/
		return firefoxOptions;
	}

	public WebDriver getFirefoxDriver(FirefoxOptions cap) {

		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("src/main/resources/drivers/geckodriver"));
			return new FirefoxDriver(cap);
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("\\grid\\geckodriver.exe"));
			return new FirefoxDriver(cap);
		} else if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			return new FirefoxDriver(cap);
		}
		return null;
	}
	
	/*public static void main(String[] args) {
		FirefoxBrowser obj = new FirefoxBrowser();
		WebDriver driver = obj.getFirefoxDriver(obj.getFirefoxOptions());
		driver.get("https://www.zomato.com/bangalore/punjabi-nawabi-hsr/order/LoqDdXx");
	}
*/

}
