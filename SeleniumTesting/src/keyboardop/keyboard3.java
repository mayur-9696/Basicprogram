package keyboardop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class keyboard3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.flipkart.com/");

		WebElement Element = driver.findElement(By.xpath("//body"));
		Element.sendKeys(Keys.ESCAPE);
		Thread.sleep(1500);
		//Scrolling - directly goto bottom of the page
		Element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(3500);
		//Scrolling- directly goto Top of the page
		Element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		

	}

}
