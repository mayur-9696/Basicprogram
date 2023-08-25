package regitraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("mechanical engg");
		List<WebElement> elements=driver.findElements(By.cssSelector("div>ul>div>ul>li>div>div>div>span>b"));
		System.out.println("home page element:"+elements.size());
		for(WebElement element:elements) {
			System.out.println(element.getText());

	}

}}
