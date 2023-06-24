package CucumberPackage.CucumberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test {
	
	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeTest
	public void setBrowser(String browser)
	{
	   if (browser.equalsIgnoreCase("Firefox")) {
	      driver = new FirefoxDriver();
	      System.setProperty("webdriver.gecko.driver", "E:\\Eclipse_workspace\\CucumberProject\\drivers\\geckodriver.exe");
	      }
	   
	   else if (browser.equalsIgnoreCase("Edge")) {
		      driver = new EdgeDriver();
		      System.setProperty("webdriver.msedge.driver", "E:\\Eclipse_workspace\\CucumberProject\\drivers\\msedgedriver.exe");
				
		      }
	   
	   else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_workspace\\CucumberProject\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		
		    driver = new ChromeDriver(options);
	     
	   }
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void sampleTest() {   
		
		driver.get("https://www.google.com");
	    
  
	}
	
	@Test
	public void sampleTest1() {   
		
	    System.out.println(driver.getTitle()); 
  
	}
	
	@Test(groups= {"Smoke"})
	public void sampleTest2() {   
		
	    driver.navigate().to("https://www.facebook.com");
	    System.out.println(driver.getTitle()); 
  
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	
}
