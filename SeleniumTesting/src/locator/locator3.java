
package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locator3 {

	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
//		String expectedTitle="vtiger";
//		String actualTitle=driver.getTitle();
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("login page open sucessfully");
//		}else {
//			System.out.println("login page not open");
//		}
		
		String appcurrentUrl=driver.getCurrentUrl();
		String expectedUrl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("appcurrent Url:"+appcurrentUrl);
		System.out.println("expected Url:"+expectedUrl);
		if(appcurrentUrl.contains(expectedUrl)) {
			System.out.println("current Url validation is passed");
		}
		else {
			System.out.println("current Url validation is failed");
		}
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		
		WebElement loginButton=driver.findElement(By.className("buttonBlue"));
		loginButton.click();
		

	}

}
