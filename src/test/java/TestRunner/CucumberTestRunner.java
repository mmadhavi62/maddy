package TestRunner;

import java.io.File;

import org.testng.annotations.AfterClass;

//import com.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features/ScenarioOutline.feature",
		glue="StepDefinition/ScenarioOutline",
		plugin = {"pretty"}
		)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

	//@AfterClass
   // public static void writeExtentReport() {
      //  Reporter.loadXMLConfig(new File("config/report.xml"));
	
}
