package regitraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

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
    	WebElement appleInputField=driver.findElement(By.cssSelector("div>ul>li>a[ href='apple-phones-48.php']"));
    	appleInputField.click();
		driver.findElement(By.cssSelector("a[href='samsung-phones-9.php']")).click();
    	List<WebElement> phones = driver.findElements(By.cssSelector("div[id='review-body'] ul>li>a"));
		System.out.println("Number of phones present on home page : "+phones.size());
		for(WebElement element:phones) {
			System.out.println(element.getText());
			driver.findElement(By.cssSelector("ul>li>a[href='vivo-phones-98.php']")).click();
	}
 }}

