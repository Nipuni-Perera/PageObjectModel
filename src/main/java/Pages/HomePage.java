package Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By signedInAs = By.xpath("/html/body/div[@class='content'][1]/h4");
	
	
	public HomePage (WebDriver driver){
		this.driver = driver;	
	}
	
	public String assertUserName () {
		return driver.findElement(signedInAs).getText();
		
	}

}
