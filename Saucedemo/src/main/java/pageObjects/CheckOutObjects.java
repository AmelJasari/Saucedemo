package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import resources.basic;




public class CheckOutObjects extends basic {
	
	
	
	
	private By btnCheckout = By.xpath("//a[@class='btn_action checkout_button']");
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By ZIP = By.xpath("//input[@id='postal-code']");
	private By ContinueBtn = By.xpath("//input[@class='btn_primary cart_button']");
	private By FirstItem = By.xpath("//div[@class='cart_list']//div[3]");
	private By Secondtem = By.xpath("//div[@class='cart_list']//div[4]");
	private By btnFinish = By.linkText("FINISH");
	
	private By lblFinish = By.xpath("//div[@class='subheader']");
	private By lblComplete = By.xpath("//h2[@class='complete-header']");
	
	
	
	public CheckOutObjects(WebDriver driver) {

		this.driver = driver;
	}

	
	public WebElement lblComplete() {
		return driver.findElement(lblComplete);
	}
	
	public WebElement lblFinish() {
		return driver.findElement(lblFinish);
	}
	
	public WebElement checkoutBTN() {
		return driver.findElement(btnCheckout);
	}
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	public WebElement ZipCode() {
		return driver.findElement(ZIP);
	}
	
	public WebElement ContinueBtn() {
		return driver.findElement(ContinueBtn);
	}
	
	public WebElement FirstItem() {
		return driver.findElement(FirstItem);
	}
	public WebElement SecondItem() {
		return driver.findElement(Secondtem);
	}
	public WebElement btnFinish() {
		return driver.findElement(btnFinish);
	}
	
	

}
