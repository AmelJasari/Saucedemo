package Automation.Saucedemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.CheckOutObjects;
import pageObjects.LoginObjects;
import pageObjects.ProductsObjects;
import pageObjects.ShopingObjects;
import resources.basic;

public class SauceSmoke extends basic {

	CheckOutObjects coo = new CheckOutObjects(driver);
	ShopingObjects so = new ShopingObjects(driver);
	ProductsObjects po = new ProductsObjects(driver);
	LoginObjects lo = new LoginObjects(driver);
	public static Logger log = LogManager.getLogger(basic.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("driver is initialized");

		driver.get(prop.getProperty("URL"));
		log.info("Pokrenuta stranica");

	}

	@Test
	public void LoginPage() {

		lo.User().sendKeys(prop.getProperty("user"));
		log.info("Unet je user");
		lo.Pass().sendKeys(prop.getProperty("password"));
		log.info("Unet je password");
		lo.Submit().click();
		log.info("Klik na submit");
		System.out.println(po.verifyLabel().getText());
		Assert.assertEquals(po.verifyLabel().getText(), "Products");

		po.sortDDL().click();
		log.info("sort ddl");
		po.priceHighToLow().click();
		log.info("odaberi high to low");
		so.BuyBackpack().click();
		log.info("odaberi backPack");
		so.buttonADD().click();
		log.info("dodali smo u shoping kartu proizvod");
		so.beckButton().click();
		log.info("Continue soping");

		so.BuytShirt().click();
		so.buttonADD().click();

	}

	@Test
	public void checkoutInformation() {

		so.shopingCartIcon().click();
		so.checkOut().click();
		coo.firstName().sendKeys("Amel");
		coo.lastName().sendKeys("Test1");
		coo.ZipCode().sendKeys("11000");
		coo.ContinueBtn().click();
	}

	@Test
	public void checkoutOverwiev() {

		SoftAssert softAssertion = new SoftAssert();
		System.out.println("first item :" + coo.FirstItem().getText());
		Assert.assertEquals(true, coo.FirstItem().getText().contains("Sauce Labs Backpack"));
		System.out.println("second item " + coo.SecondItem().getText());
		softAssertion.assertEquals(coo.SecondItem().getText(), "Sauce Labs Bolt T-Shirt");
		Assert.assertTrue(coo.btnFinish().isDisplayed());

		coo.btnFinish().click();

	}

	@Test
	public void complateShoping() {

		
		Assert.assertTrue(coo.lblFinish().isDisplayed());
		System.out.println(coo.lblComplete().getText());

	}

	
	  @AfterTest public void closeBrowser() {
	  driver.close(); 
	  driver = null; 
	   }
	 

}
