package browserope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverpath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe.";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver=new FirefoxDriver();
		//maximise the browser window
		driver.manage().window().maximize();
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("https://www.amazon.in");
		
		
	}

}
