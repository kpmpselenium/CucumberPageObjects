package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchCarPageLocators {
	
	@FindBy(how=How.XPATH,using="//select[@id='makes']")
	public WebElement carMakeDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='models']")
	public WebElement carModelDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='locations']")
	public WebElement selectLocationDropdown;
	
	@FindBy(how=How.XPATH,using="//select[@id='priceTo']")
	public WebElement maxPriceDropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-submit']")
	public WebElement findMyNextCarBtn;

}
