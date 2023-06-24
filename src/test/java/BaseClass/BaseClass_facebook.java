package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass_facebook {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass_facebook() {
		try {
			prop=new Properties();
			FileInputStream fr=new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\cucumber.properties");
			prop.load(fr);
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
	}	
	
	public static void launchBrowser(){
		
	String browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_workspace\\CucumberProject\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
	    driver = new ChromeDriver(options);
    	
	}
	
	else if(browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_workspace\\CucumberProject\\drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
	else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","E:\\Eclipse_workspace\\CucumberProject\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(prop.getProperty("facebook_URL"));
	
	}
	
	public static void tearDown() {
		driver.close();
	}
}
