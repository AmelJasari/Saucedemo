package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic {

	// ako zelimo da pustimo testove paralelno webDriver driver ne sme da bude
	// static
	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		// ovako direktno iz mvn komande
		// String browser =System.getProperty("browser");
		// ovako upisujemo u test, tj u property file
		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Amel\\eclipse-workspace\\Saucedemo\\src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\Amel\\eclipse-workspace-kurs\\samsvojmajstor\\src\\main\\java\\resources\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void getScreenshot(String result) {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
	}

	
	/*
	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("C:\\Users\\Amel\\eclipse-workspace\\Saucedemo\\testPrtScr\\" + result + "scrError.png"));
		// FileUtils.copyFile(src, new File(System.getProperty("user.dir") +
		// "\\testPrtScr\\" + result + " scrError.png"));

	}
*/
}
