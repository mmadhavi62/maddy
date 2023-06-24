package CucumberPackage.CucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OzoneSignUp {
	
	public void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ozone.one");
WebElement signUp = driver.findElement(By.xpath("//*[text()='Sign up / Log in']"));
	signUp.click();
WebElement signUp_newAccnt = driver.findElement(By.id("Login_SignUp"));
signUp_newAccnt.click();
WebElement signUp_Email = driver.findElement(By.id("SignUp_EmailField"));
signUp_Email.click();
WebElement txtAccountName = driver.findElement(By.id("SignUp_AccountNameField"));
txtAccountName.sendKeys("abd");
WebElement txtEmailId = driver.findElement(By.name("email"));
txtEmailId.sendKeys("abd@gmail.com");
WebElement txtPasswrd = driver.findElement(By.name("password"));
txtPasswrd.sendKeys("Fjhjkj@789");
WebElement btnSignUp = driver.findElement(By.id("SignUp_SubmitForVerification"));
btnSignUp.click();
	}
}
