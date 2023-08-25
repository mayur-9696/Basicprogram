package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ticketb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Makemytrip.com/");
		driver.findElement(By.cssSelector("[class='makeFlex column flexOne whiteText latoBold']")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.cssSelector("div>[class='chHeaderContainer']>nav>ul>li:nth-of-type(6)>a>span:nth-of-type(2) ")).click();

	}

	
	}
