package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	WebDriver driver;
	
	By register     = By.xpath("//a[normalize-space()='Register']");
	By gender       = By.xpath("//label[normalize-space()='Male']");
	By firstName    = By.xpath("//input[@id='FirstName']");
	By LastName     = By.xpath("//input[@id='LastName']");
	By email        = By.xpath("//input[@id='Email']");
	By password     = By.xpath("//input[@id='Password']");
	By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	By registerBTN = By.xpath("//input[@id='register-button']");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void Registeration() {
		driver.findElement(register).click();
		driver.findElement(gender).click();
		driver.findElement(firstName).sendKeys("Jawaharshreenath");
		driver.findElement(LastName).sendKeys("T");
		driver.findElement(email).sendKeys("sivajawahar123@gmail.com");
		driver.findElement(password).sendKeys("Shree@1810");
		driver.findElement(confirmPassword).sendKeys("Shree@1810");
		driver.findElement(registerBTN).click();
	}
}
