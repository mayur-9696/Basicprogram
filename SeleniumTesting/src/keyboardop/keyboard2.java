package keyboardop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class keyboard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
        firstname.sendKeys(Keys.chord(Keys.CONTROL,"C") );
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
