package seleniumBasics;

import org.openqa.selenium.By;

public class Locator extends Base{
	
	public void verifyLocator() {
		driver.findElement(By.id("button-one"));//id is the first attribute.
		driver.findElement(By.className("btn btn-primary"));// class is the second attribute 
	    driver.findElement(By.tagName("button"));// tag name is the 3rd attribute
	    driver.findElement(By.name("viewport"));// 4th attribute is name
	    driver.findElement(By.linkText("Simple Form Demo"));//
	    driver.findElement(By.partialLinkText("Simple"));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
