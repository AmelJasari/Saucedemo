package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.basic;



public class LoginObjects extends basic {

	
	private By Username = By.id("user-name");
	private By Password = By.id("password");
	private By Submit = By.xpath("//input[@class='btn_action']");
	
	

	
	
	public LoginObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement User() {
		return driver.findElement(Username);
	}

	public WebElement Pass() {
		return driver.findElement(Password);
	}

	public WebElement Submit() {
		return driver.findElement(Submit);
	}

}
