package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath=System.getProperty("user dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTIME-login";
		String actualTitle=driver1.getTitle();
		if(actualTitle.equals (expectedTitle)) {
			System.out.println("login page open sucessfully");
		}else {
			System.out.println("login page not open sucessfully");
		}
		//identify require element from the UI
		WebElement userNameInputField=driver1.findElement(By.id("userName"));
		//perform appropriate action the identified element
		userNameInputField.sendKeys("admin1234567");
		//remove existing text from the input field
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		//identify the required element from the UI
		WebElement passwordInputField=driver1.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		//identify the required element from the UI
		WebElement loginButton=driver1.findElement(By.id("loginButton"));
		//perform appropriate action the identified element
		loginButton.click();
		
		//driver1.close();
		
		
		
		
		

	}

}
