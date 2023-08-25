package regitraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.cssSelector("div>a[href='/live-cricket-score']")).click();
		driver.navigate().back();
		List<WebElement> names=driver.findElements(By.cssSelector("div>[class='ds-flex ds-flex-row']>div"));
		System.out.println("home page name:"+names.size());
		for(WebElement element:names) {
			System.out.println(element.getText());
		}

	}

}
