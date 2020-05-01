package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import resources.basic;




public class ShopingObjects extends basic {
	
	
	
	private By yourCart = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	private By btnADD = By.xpath("//button[@class='btn_primary btn_inventory']");
	private By btnContinueShoping = By.xpath("//a[@class='btn_secondary']");
	private By BuyShirt = By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]");
	private By backLink = By.xpath("//button[contains(text(),'<- Back')]");
	private By shopinCartIcon = By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");
	private By checkout = By.xpath("//a[@class='btn_action checkout_button']");
	
	
			
	
	public ShopingObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement shopingCartIcon() {
		return driver.findElement(shopinCartIcon);
	}

	public WebElement BuyBackpack() {
		return driver.findElement(yourCart);
	}
	
	public WebElement buttonADD() {
		return driver.findElement(btnADD);
	}
	
	public WebElement buttonContinueShoping() {
		return driver.findElement(btnContinueShoping);
	}
	
	public WebElement BuytShirt() {
		return driver.findElement(BuyShirt);
	}
	public WebElement beckButton() {
		return driver.findElement(backLink);
	}
	
	public WebElement checkOut() {
		return driver.findElement(checkout);
	}
	
	

}
