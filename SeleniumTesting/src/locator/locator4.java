package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator4 {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"//executables//Chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath );
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
//		String appcurrentUrl=driver.getCurrentUrl();
//		String exepectedUrl="https://facebook.com";
//		System.out.println(+appcurrentUrl);
//		System.out.println(+exepectedcurrentUrl);
//		if(appcurrentUrl.contains(exepectedUrl));{
//			System.out.println("current Url validation is passed");
//		}else {
//			System.out.println("current Url validation is failed");
//		}
		String actualtitle=driver.getTitle();
		String exepectedtitle="facebook";
		if(actualtitle.equals(exepectedtitle)) {
			System.out.println("login page open sucessfully");
		}else {
			System.out.println("login page not open sucessfully");
		}
		WebElement userNameInputField=driver.findElement(By.id("email"));
		userNameInputField.clear();
		userNameInputField.sendKeys("7720856527");
		WebElement passwordInputField=driver.findElement(By.id("pass"));
		passwordInputField.clear();
		passwordInputField.sendKeys("");
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		
		
		
		
		
		

	}

}
