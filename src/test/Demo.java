package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Demo extends BaseTest {

	public void openURL() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void loginPage() {
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
		
		WebElement loninButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loninButton.click();
	}
	
	public void productPage () {
		WebElement sauceLabsBackpack = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		sauceLabsBackpack.click();
	}
	
	public void addToCartPage () {
		WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]"));
		AddToCart.click();
		
		WebElement shoppingCartLink = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		shoppingCartLink.click();
	}
	
	public void yourCartPage() {
		WebElement checkoutButton = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		checkoutButton.click();
	}
	
	public void yourInformation() {
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
		firstName.sendKeys("Boni");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
		lastName.sendKeys("Amin");
		
		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
		zipCode.sendKeys("12345");
		
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		continueButton.click();
	}	
	
	public void overviewPage() {
		WebElement finishButton = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
		finishButton.click();
	}
	
	public void complitePage () {
		WebElement previewText = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
		String text = previewText.getText();
		System.out.println(text);
	}
	
}
