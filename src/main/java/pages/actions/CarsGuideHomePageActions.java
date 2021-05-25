package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
	
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		//PageFactory.initElements(SeleniumDriver.getDriver(), CarsGuideHomePageLocators.class);
		PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators);
	}
	
	public void moveToBuyandSellMenu() {
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buyAndSellLink).perform();;
		
	}
	
	public void moveToReviewsMenu() {
		
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviewsLink).perform();
		
	}
	
	public void clickSearchCarslink() {
		
		carsGuideHomePageLocators.SearchCarsLink.click();
	}
	
	public void clickUsedCarsSearchLink() {
		
		carsGuideHomePageLocators.SearchUsedCarsLink.click();
		
	}
	

}
