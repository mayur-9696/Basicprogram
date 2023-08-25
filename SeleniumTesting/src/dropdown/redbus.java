package dropdown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://redbus.com/");
		driver.findElement(By.cssSelector("div>[class='sc-jTzLTM bfMZDh']")).click();
		driver.findElement(By.cssSelector("div>[id='src']")).sendKeys("Pune, Maharashtra, India");
		driver.findElement(By.cssSelector("div>[id='dest']")).sendKeys("Mumbai, Maharashtra, India");
		driver.findElement(By.cssSelector("div>[id='onward_cal']")).click();
		driver.findElement(By.cssSelector("div>[class='calendar_wrapper rdc-onward-calendar']"
				+ ">div>div>div:nth-child(3)>span:nth-child(4)>div:nth-child(7)>span")).click();
		driver.findElement(By.cssSelector("[class='search-lbl']")).click();
		driver.findElement(By.cssSelector("div>[class='returndate input-box ']>div>input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div>[class='calendar_wrapper rdc-return-calendar']>div>div>div:nth-child(3)"
				+ ">span:nth-child(5)>div:nth-child(7)>span)")).click();
		
		
		
		

	}

}
