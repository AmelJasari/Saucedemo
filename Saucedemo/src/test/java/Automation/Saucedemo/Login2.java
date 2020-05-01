package Automation.Saucedemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login2 {

	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Amel\\eclipse-workspace\\Saucedemo\\src\\main\\java\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*
	driver.get("https://www.saucedemo.com/index.html");
	driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@class='btn_action']")).click();
	
	*/
	driver.get("https://www.saucedemo.com/inventory.html");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector(".product_label"));
	driver.findElement(By.cssSelector(".product_sort_container")).click();
	driver.findElement(By.xpath("//option[contains(text(),'Price (high to low)')]")).click();
	
	driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
	
	
	System.out.println("done");
	
	
	//driver.close();

	}
	
	
		
		
		
		
		
	
	
}
	
	
