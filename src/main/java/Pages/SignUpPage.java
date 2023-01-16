package Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	WebDriver driver;
	By registerbtn = By.linkText("Register");
	By title = By.name("title");
	By firstName = By.name("firstname");
	By surName = By.name("lastname");
	By phoneNumber = By.name("phone");
	By dobYear = By.name("year");
	By dobMonth = By.name("month");
	By dobDate = By.name("date");
	By licenceType = By.id("licencetype_f");
	By licencePeriod = By.name("licenceperiod");
	By occupation = By.name("occupation");
	By street = By.name("street");
	By city = By.name("city");
	By county = By.name("county");
	By postcode = By.name("post_code");
	By email = By.name("email");
	By password = By.name("password");
	By confirmPassword = By.name("c_password");
	By submitbtn = By.name("submit");
	
	public SignUpPage (WebDriver driver){
		this.driver = driver;	
	}
	
	public void clickRegister () {
		driver.findElement(registerbtn).click();
		
	}
	
	public void setTitle (String strTitle) {
		Select drpTitle = new Select(driver.findElement(title));
		drpTitle.selectByVisibleText(strTitle);
	}
	
	public void setFirstName (String strFirstName) {
		driver.findElement(firstName).sendKeys(strFirstName);
		
	}
	public void setSurName (String strSurName) {
		driver.findElement(surName).sendKeys(strSurName);
		
	}
	public void setPhoneNumber (String strPhoneNumber) {
		driver.findElement(phoneNumber).sendKeys(strPhoneNumber);
		
	}
	public void setDobYear (String strDobYear) {
		Select drpYear = new Select(driver.findElement(dobYear));
		drpYear.selectByVisibleText(strDobYear);
		
	}
	public void setDobMonth (String strDobMonth) {
		Select drpMonth = new Select(driver.findElement(dobMonth));
		drpMonth.selectByVisibleText(strDobMonth);
		
	}
	public void setDobDate (String strDobDate) {
		Select drpDate = new Select(driver.findElement(dobDate));
		drpDate.selectByVisibleText(strDobDate);
		
	}
	public void clickliceneceType () {
		driver.findElement(licenceType).click();
		
	}
	public void setLicencePeriod (String strLicencePeriod) {
		Select drpLicence = new Select(driver.findElement(licencePeriod));
		drpLicence.selectByVisibleText(strLicencePeriod);
		
	}
	public void setOccupation (String strOccupation) {
		Select drpOccupation = new Select(driver.findElement(occupation));
		drpOccupation.selectByVisibleText(strOccupation);
		
	}
	public void setStreet (String strStreet) {
		driver.findElement(street).sendKeys(strStreet);
		
	}
	public void setCity (String strCity) {
		driver.findElement(city).sendKeys(strCity);
		
	}
	public void setCounty (String strCounty) {
		driver.findElement(county).sendKeys(strCounty);
		
	}
	public void setPostCode (String strPostCode) {
		driver.findElement(postcode).sendKeys(strPostCode);
		
	}
	public void setEmail (String strEmail) {
		driver.findElement(email).sendKeys(strEmail);
		
	}
	public void setPassword (String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
		
	}
	public void setConfirmPassword (String strConfirmPassword) {
		driver.findElement(confirmPassword).sendKeys(strConfirmPassword);
		
	}
	public void clickCreate () {
		driver.findElement(submitbtn).click();
		
	}
	
	}
