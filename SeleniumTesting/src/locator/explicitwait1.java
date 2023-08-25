package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait1 {

	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//need to enter application URL in the opened browser
		driver.get("https://demo.actiTime.com");
		String appcurrentUrl=driver.getCurrentUrl();
		String expectedUrl="https://demo.actitime.com/login.do";
		System.out.println("appcurrent Url:"+appcurrentUrl);
		System.out.println("expected Url:"+expectedUrl);
		if(appcurrentUrl.contains(expectedUrl)) {
			System.out.println("current Url validation is passed");
		}
		else {
			System.out.println("current Url validation is failed");
		}
//		String actualTitle=driver.getTitle();
//		String expectedTitle="actitime-login";
//		System.out.println("actual Title:"+actualTitle);
//		System.out.println("expected Title:"+expectedTitle);
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("current Url validation is passed");
//		}
//		else {
//			System.out.println("current Url validation is failed");
//		}
//		//get the webpage source containt
//		String sourceContent=driver.getPageSource();
//		System.out.println("source content length"+sourceContent.length());
		//identify require element from the UI
				WebElement userNameInputField=driver.findElement(By.id("userName"));
				//perform appropriate action the identified element
				//userNameInputField.sendKeys("admin1234567");
				//remove existing text from the input field
			//	userNameInputField.clear();
				userNameInputField.sendKeys("admin");
				//identify the required element from the UI
				WebElement passwordInputField=driver.findElement(By.name("pwd"));
				passwordInputField.sendKeys("manager");
				//identify the required element from the UI
				WebElement loginButton=driver.findElement(By.id("loginButton"));
				//perform appropriate action the identified element
				loginButton.click();
				WebElement logoutBtn=driver.findElement(By.linkText("Logout"));
				
				//explicit wait
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
				System.out.println("After login page title:"+driver.getTitle());
				
				driver.close();
	}

}
