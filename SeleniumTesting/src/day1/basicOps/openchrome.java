package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Absolute path
//				String driverPath1="E:\\Acceleration\\workspace\\SeleniumTesting\\executables\\chromedriver.exe";
//				//or Relative path --> '.' indicate current working dir
//				String driverPath2=".\\executables\\chromedriver.exe";
//				//or using System class
//				String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
		//		System.setProperty("webdriver.chrome.driver", driverPath1);
				//create an instance of required browser class
				
				WebDriverManager.chromedriver().setup();
				WebDriver cdriver=new ChromeDriver();
				cdriver.get("https://www.google.com");
				
	}

}
