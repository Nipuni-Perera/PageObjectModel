package TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	
	WebDriver driver;
	SoftAssert sa;

	SignUpPage objSignUp;
	LoginPage objLogin;
	HomePage objHome;
	
	@BeforeTest
	public void setup() {
		sa = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
	}
	
	@Test
	public void signup_for_insurance() {
		
		objSignUp = new SignUpPage (driver);
		objSignUp.clickRegister();
		objSignUp.setTitle("Miss");
		objSignUp.setFirstName("Kate");
		objSignUp.setSurName("Tester");
		objSignUp.setPhoneNumber("0987635241");
		objSignUp.setDobYear("1989");
		objSignUp.setDobMonth("March");
		objSignUp.setDobDate("20");
		objSignUp.clickliceneceType();
		objSignUp.setLicencePeriod("10");
		objSignUp.setOccupation("Dentist");
		objSignUp.setStreet("1st Street");
		objSignUp.setCity("Tst City");
		objSignUp.setCounty("Tst County");
		objSignUp.setPostCode("43847");
		objSignUp.setEmail("tester.g@mailtainer.com");
		objSignUp.setPassword("1234");
		objSignUp.setConfirmPassword("1234");
		objSignUp.clickCreate();
		
		objLogin = new LoginPage(driver);
		objLogin.setUserName("tester.g@mailtainer.com");
		objLogin.setPassword("1234");
		objLogin.clickLogin();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[@class='content'][1]/h4")));
		objHome = new HomePage(driver);
		sa.assertTrue(objHome.assertUserName().contains("tester.g@mailtainer.com"));
		driver.close();
        driver.quit();
		
		
	}
	

}
 