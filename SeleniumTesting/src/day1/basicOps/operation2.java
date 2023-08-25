package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath3 = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath3);
		WebDriver driver = new ChromeDriver();
		driver.get("https//www.actitime.com/");
		String appcurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https//www.actitime.com/";
		System.out.println("appcurrent Url:" +appcurrentUrl);
		System.out.println("expected Url:" +expectedUrl);
		if (appcurrentUrl.contains(expectedUrl)) {
			System.out.println("current Url validation is passed");
		} else {
			System.out.println("current Url validation is failed");
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="actitime";
		System.out.println("actual Title:"+actualTitle);
		System.out.println("xpected Title:"+expectedTitle);
		System.out.println("actualTitle.length:"+actualTitle.length());
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("current Url validation is passed");
		}
		else {
			System.out.println("current Url validation is failed");
		}
		String sourceContent=driver.getPageSource();
		System.out.println("source content length:"+sourceContent.length());
		driver.close();
		

	}
}
