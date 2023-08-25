package synchronisation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameInputField = driver.findElement(By.id("username"));
	//	userNameInputField.sendKeys("admin");
		
		System.out.println("Username input field visibility status is : "+userNameInputField.isDisplayed());
		System.out.println("username input field editable status is : "+userNameInputField.isEnabled());
		String ActualDefaultTextOnUsernameField=userNameInputField.getAttribute("value");
		System.out.println("Default text validation for username field: "+ActualDefaultTextOnUsernameField.equals("admin"));
		
		WebElement passwordInputField=driver.findElement(By.id("password"));
		System.out.println("password input field visibility status is : "+passwordInputField.isDisplayed());
		System.out.println("password input field editable status is : "+passwordInputField.isEnabled());
		String ActualDefaultTextOnpasswordField=passwordInputField.getAttribute("value");
		System.out.println("Default text validation for username field: "+ActualDefaultTextOnpasswordField.equals("Test@123"));
			
		WebElement loginButton=driver.findElement(By.className("buttonBlue"));
		System.out.println("Tag name for login button : "+loginButton.getTagName());
		System.out.println("login field visibility status is : "+loginButton.isDisplayed());
		System.out.println("login field editable status is : "+loginButton.isEnabled());
		String ActualloginButtonname=loginButton.getTagName();	
		System.out.println("login button name validation:"+ActualloginButtonname.equals("buttonBlue"));
//		loginButton.click();
		
		WebElement forgotpassword=driver.findElement(By.className("forgotPasswordLink"));
		System.out.println("forgotpassword field visibility status is : "+forgotpassword.isDisplayed());
		System.out.println("forgotpassword field editable status is : "+forgotpassword.isEnabled());
		System.out.println("forgotpassword tag name:"+forgotpassword.getTagName());
		String Actualforgotpassword=forgotpassword.getTagName();
		System.out.println("forgot validation:"+Actualforgotpassword.equals("forgotPasswordLink"));
	}

}
