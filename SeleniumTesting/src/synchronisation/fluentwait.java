package synchronisation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		//implicitwait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String appCurrentUrl=driver.getCurrentUrl();
		String exepectedUrl=("https://demo.vtiger.com/vtigercrm/index.php");
		if (appCurrentUrl.equals(exepectedUrl)) {
			System.out.println("url is validation passed");
		}else {
			System.out.println("url validation is failed");
		}
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		WebElement loginbutton=driver.findElement(By.className("buttonBlue"));
		loginbutton.click();
		//fluentwait
		Wait wait=new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		System.out.println("home page title is:"+driver.getTitle());
		
	
	}

}
