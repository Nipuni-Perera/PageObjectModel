package Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By loginUserName = By.name("email");
	By loginPassword = By.name("password");
	By loginBtn = By.name("submit");
	
	
	public LoginPage (WebDriver driver){
		this.driver = driver;	
	}
	
	
	public void setUserName (String strUserName) {
		driver.findElement(loginUserName).sendKeys(strUserName);
		
	}
	public void setPassword (String strPassword) {
		driver.findElement(loginPassword).sendKeys(strPassword);
		
	}
	public void clickLogin () {
		driver.findElement(loginBtn).click();
		
	}
}
