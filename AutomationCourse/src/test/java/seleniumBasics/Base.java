package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public WebDriver driver;

public void initialiseBrowser() {
driver=new FirefoxDriver();
driver.get("https://selenium.qabible.in/");
driver.manage().window().maximize();

}
public void driverCloseAndQuit() {
	//driver.close();
	driver.quit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method s
		Base base=new Base();
		base.initialiseBrowser();
		base.driverCloseAndQuit();
	}

}
