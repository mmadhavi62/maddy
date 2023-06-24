package PageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.BaseClass;

public class AddToCartClass extends BaseClass{

	/*
	
	@FindBy(xpath="//span[@id='gh-ug']//a[text()='Sign in']")
	public WebElement signin;
	
	@FindBy(css="#userid")
	public WebElement Username;
	
	
	@FindBy(css="#signin-continue-btn")
	public WebElement continueButton;
	
	@FindBy(css="#pass")
	public WebElement Password;
	
	@FindBy(css="#sgnBt")
	public WebElement SigninButton;
	
	*/
	
	@FindBy(css="button#gh-shop-a")
	public WebElement ShopByCategory;
	
	@FindBy(xpath="//a[text()='Cell phones & accessories']")
	public WebElement CellPhonesAndAccessories;
	
	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")
	public WebElement CellPhonesAndSmartPhones;
	
	@FindBy(xpath="//img[@alt='Apple']")
	public WebElement AppleBrand;
	
	@FindBy(xpath="//img[@alt='Apple iPhone 13 Pro Max']")
	public WebElement AppleIphone;
	
	@FindBy(xpath="//h2[text()='Buy It Now']")
	public WebElement BuyItNow;
	
	@FindBy(xpath="//h3[text()='Apple iPhone 13 Pro Max 256GB Graphite Unlocked']")
	public WebElement Iphone13;
	
	//String mainWindow = BaseClass.driver.getWindowHandle();
	//Set <String> AllWindows = BaseClass.driver.getWindowHandles();
	
	
	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement AddToCart;
	
	
	
	public AddToCartClass() {
		//this.driver=driver;
	PageFactory.initElements(BaseClass.driver, this);
	}
	
	/*
	public void SignIn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		signin.click();
	}
	
	public void credentials(String username,String password) {
		Username.sendKeys(username);
		continueButton.click();
		Password.sendKeys(password);
		SigninButton.click();
	}
	*/
	
	public void CellPhones() {
		ShopByCategory.click();
		CellPhonesAndAccessories.click();
		CellPhonesAndSmartPhones.click();
	}
	
	public void SelectApple() {
		AppleBrand.click();
		AppleIphone.click();	
	}
	
	public void SelectIphone() {
		BuyItNow.click();
		Iphone13.click();
		//BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 ArrayList<String> tabs = new ArrayList<String> (BaseClass.driver.getWindowHandles());
		    BaseClass.driver.switchTo().window(tabs.get(1));
		    System.out.println(BaseClass.driver.getTitle());
		    AddToCart.click();
		    BaseClass.driver.close();
		    BaseClass.driver.switchTo().window(tabs.get(0));
		    System.out.println(BaseClass.driver.getTitle());
		
	}
	
	
	
}
