package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By computer = By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']");
	By Desktops = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
	By Product = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
	By ssd = By.xpath("//input[@id='product_attribute_16_3_6_18']");
	By cart = By.xpath("//input[@id='add-to-cart-button-16']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProuct() {
		driver.findElement(computer).click();
		driver.findElement(Desktops).click();
		driver.findElement(Product).click();
		driver.findElement(ssd).click();
		driver.findElement(cart).click();
	}

}
