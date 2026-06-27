package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By login    = By.xpath("//a[normalize-space()='Log in']");
	By email    = By.xpath("//input[@id='Email']");
	By pass     = By.xpath("//input[@id='Password']");
	By LoginBTN = By.xpath("//input[@value='Log in']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver ;
	}

	public void login() {
		driver.findElement(login).click();
		driver.findElement(email).sendKeys("sivajawahar123@gmail.com");
		driver.findElement(pass).sendKeys("Shree@1810");
		driver.findElement(LoginBTN).click();
	}
}
