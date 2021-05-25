package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement buyAndSellLink;
	
	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement reviewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement SearchCarsLink;
	
	@FindBy(how=How.XPATH,using="//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	public WebElement SearchUsedCarsLink;
	

}
