package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseClass.BaseClass_facebook;

public class facebookLocators extends BaseClass_facebook{
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;	
	
	@FindBy(name="login")
	private WebElement login_button;
	
	public facebookLocators() {
		//BaseClass_facebook.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void email() {
		email.sendKeys(prop.getProperty("facebook_email"));
	}
	
	public void password() {
		pass.sendKeys(prop.getProperty("facebook_password"));
	}
	
	public void login() {
		String s = login_button.getCssValue("background-color");
		String c = Color.fromString(s).asHex();
		System.out.println("Background color of login button" +c);
		System.out.println("Font size of login text: " +login_button.getCssValue("font-size"));
		//System.out.println(login_button.getCssValue("background-color"));
		login_button.click();
	}
	
}
