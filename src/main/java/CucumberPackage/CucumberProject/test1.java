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

public class test1 {
	
	WebDriver driver;
		
	
	@Test
	public void sampleTest3() {   
		
		System.out.println("SampleTest3");
  
	}
	
	@Test
	public void sampleTest4() {   
		
	    System.out.println("SampleTest4"); 
  
	}
	
	@Test(groups= {"Smoke"})
	public void sampleTest5() {   
		
	    System.out.println("SampleTest5");
		
	}
	
	
}
