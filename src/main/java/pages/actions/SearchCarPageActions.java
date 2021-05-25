package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.SearchCarPageLocators;
import utils.SeleniumDriver;

public class SearchCarPageActions {
	
	SearchCarPageLocators searchCarPageLocators=null;
	
	public SearchCarPageActions() {
		
		this.searchCarPageLocators=new SearchCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchCarPageLocators);
	}
	
	public void selectCarMake(String carMake) {
		
		Select select=new Select(searchCarPageLocators.carMakeDropdown);
		select.selectByVisibleText(carMake);
		
	}
	
	public void selectCarModel(String carModel) {
		
		Select select=new Select(searchCarPageLocators.carModelDropdown);
		select.selectByVisibleText(carModel);
		
	}
	
	public void selectLocation(String location) {
		
		Select select=new Select(searchCarPageLocators.selectLocationDropdown);
		select.selectByVisibleText(location);
		
	}
	
	public void selectMaxPrice(String maxPrice) {
		
		Select select=new Select(searchCarPageLocators.maxPriceDropdown);
		select.selectByVisibleText(maxPrice);
		
	}
	
	public void clickFindMyNextCarBtn() {
		
		searchCarPageLocators.findMyNextCarBtn.click();
		
	}
	

}
