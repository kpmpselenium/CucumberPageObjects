package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features={"src/test/resources/features"}, 
		glue= {"steps","hooks"}, 
		monochrome=true, 
		dryRun=false,
		tags="@Used-Car-Search", 
				plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class RunCuke extends AbstractTestNGCucumberTests {
	
	
	}                                                                                                       
	




