package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//need to enter application URL in the opened browser
		driver.get("https://www.google.com");
		String appcurrentUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.google.com";
		System.out.println("appcurrent Url:"+appcurrentUrl);
		System.out.println("expected Url:"+expectedUrl);
		if(appcurrentUrl.contains(expectedUrl)) {
			System.out.println("current Url validation is passed");
		}
		else {
			System.out.println("current Url validation is failed");
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("actual Title:"+actualTitle);
		System.out.println("expected Title:"+expectedTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("current Url validation is passed");
		}
		else {
			System.out.println("current Url validation is failed");
		}
		//get the webpage source containt
		String sourceContent=driver.getPageSource();
		System.out.println("source content length"+sourceContent.length());
		driver.close();
		

	}

}
