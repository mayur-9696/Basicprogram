package browserope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class new1 {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// Maximize the page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.get("https://www.gsmarena.com/");
		//WebElement samsungInputField=driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']"));
	}

}
