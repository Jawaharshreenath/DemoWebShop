package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {
	WebDriver driver;
	
	By cart = By.xpath("//span[normalize-space()='Shopping cart']");
	By checkBox = By.xpath("(//input[@name='removefromcart'])[1]");
	By remove = By.xpath("//input[@name='updatecart']");
	
	public cartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void CartOption() {
		driver.findElement(cart).click();
		driver.findElement(checkBox).click();
		driver.findElement(remove).click();
	}

}
