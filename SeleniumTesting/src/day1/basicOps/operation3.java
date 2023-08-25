package day1.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath3 = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath3);
		WebDriver driver = new FirefoxDriver();
		driver.get("https//www.facebook.com/");
		String appcurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https//www.facebook.com/";
		System.out.println("appcurrent Url:" +appcurrentUrl);
		System.out.println("expected Url:" +expectedUrl);
		if (appcurrentUrl.contains(expectedUrl)) {
			System.out.println("current Url validation is passed");
		} else {
			System.out.println("current Url validation is failed");
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="facebook";
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
