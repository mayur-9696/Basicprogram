package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actitime-login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("login page open successfully");
		}else {
			System.out.println("login page not open successfully");
		}
		driver.manage().window().maximize();
		
		WebElement UserNameInputField=driver.findElement(By.id("username"));
		UserNameInputField.sendKeys("admin1234567");
		UserNameInputField.clear();
		UserNameInputField.sendKeys("admin");
		WebElement PasswordInputField=driver.findElement(By.cssSelector("input[name='pwd']"));
		PasswordInputField.sendKeys("manager");
		WebElement LoginButton=driver.findElement(By.cssSelector("a[id='loginButton']"));
		LoginButton.click();
		driver.findElement(By.id("a[id='logoutLink']")).click();
	}

}
