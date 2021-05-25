package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	UsedCarsSearchPageLocators usedCarSearchPageLocators=null;
	public  UsedCarsSearchPageActions()
	{
		//this.driver=driver;
		this.usedCarSearchPageLocators= new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(usedCarSearchPageLocators.usedCarMakeDropdown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(usedCarSearchPageLocators.usedCarModelDropdown);
		
		selectCarModel.selectByVisibleText(carModel);
		
		
	}
	public void selectLocation(String location)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(usedCarSearchPageLocators.selectLocationDropdown);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='priceTo']")).click();
		Select selectPrice=new Select(usedCarSearchPageLocators.maxPriceDropdown);
		/*
		 * List<WebElement> list=selectPrice.getOptions(); for(WebElement s:list) {
		 * System.out.println("--->"+s.getText()); }
		 */
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		usedCarSearchPageLocators.findMyNextCarBtn.click();
		
	}

}



