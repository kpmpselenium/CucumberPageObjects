package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT=30;
	public final static int PAGELOAD_TIMEOUT=50;
	
	private SeleniumDriver() {
		//WebDriverManager.chromedriver.setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\workspace-eclipse\\CucumberPageObjects\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		waitDriver = new WebDriverWait(driver, TIMEOUT);
		//String window=driver.getWindowHandle();
       // System.out.println("Window handle name is ->"  +window);
		
	}
	
	public static void openPage(String Url) {
		
		System.out.println("URL to get is :" +Url);
    	System.out.println("Current driver is :"  +driver);
		driver.get(Url);
	}
	
	public static WebDriver getDriver() {
		
		return driver;
		
	}
	
	public static void setupDriver() {
		
		if(seleniumDriver==null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
	public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
