package day1.basicOps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath1="E:\\Acceleration\\workspace\\SeleniumTesting\\src\\day1\\basicOps\\openfirefox.java";
		String driverPath2="\\executables\\geckodriver.exe"	;
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driverPath3);
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
