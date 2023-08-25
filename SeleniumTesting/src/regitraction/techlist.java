package regitraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/");
		System.out.println("home page title:"+driver.getCurrentUrl());
		driver.findElement(By.cssSelector("nav>div>div>div>div>div>div>ul>li:nth-of-type(1)>a")).click();
		Thread.sleep(3000);
		System.out.println("java title:"+driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.cssSelector("nav>div>div>div>div>div>div>ul>li:nth-of-type(2)>div>a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("nav>div>div>div>div>div>div>ul>li:nth-of-type(7)>div>a")).click();
		

	}

}
