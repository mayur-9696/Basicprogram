package keyboardop;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class keyboard4 {

	public static void main(String[] args) throws InterruptedException {
			SeleniumUtility s1=new SeleniumUtility();
			WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
		
			try {
				WebElement element = driver.findElement(By.xpath("//body"));
				element.sendKeys(Keys.ESCAPE);
			}
			catch(NoSuchElementException e) {
				
			}
			Thread.sleep(1500);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);

	}

}
