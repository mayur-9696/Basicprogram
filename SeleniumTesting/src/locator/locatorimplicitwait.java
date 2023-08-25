package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locatorimplicitwait {

	public static void main(String[] args) {
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
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
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);

		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
		System.out.println("After login page title:"+driver.getTitle());
		
		driver.close();
		

	}

}
