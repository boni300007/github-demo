package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alami\\Desktop\\3nd Batch Class\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
