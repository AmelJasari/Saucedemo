package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import resources.basic;




public class ProductsObjects extends basic {
	
	private By productLabel = By.cssSelector(".product_label");
	private By sortDDL = By.cssSelector(".product_sort_container");
	private By priceHTL = By.xpath("//option[contains(text(),'Price (high to low)')]");
	
	
	//span[@class='fa-layers-counter shopping_cart_badge']
	
			
	
	public ProductsObjects(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement verifyLabel() {
		return driver.findElement(productLabel);
	}

	public WebElement sortDDL() {
		return driver.findElement(sortDDL);
	}
	
	public WebElement priceHighToLow() {
		return driver.findElement(priceHTL);
	}
	
	

}
