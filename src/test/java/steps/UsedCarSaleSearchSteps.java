package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarSaleSearchSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions=new UsedCarsSearchPageActions();
	

@Given("I navigate to the  Home Page {string} of CarsGuide Website")
public void i_navigate_to_the_home_page_of_cars_guide_website(String webUrl) {
	SeleniumDriver.openPage(webUrl);
    
}

@When("I move to buyandsell Menu")
public void i_move_to_buyandsell_menu() {
	carsGuideHomePageActions.moveToBuyandSellMenu();
}

@When("click on submenu Used Cars Search link")
public void click_on_submenu_used_cars_search_link() {
	carsGuideHomePageActions.clickUsedCarsSearchLink();
}

@And("select carMaker from AnyMake dropdown in Used Cars Search page")
public void select_car_maker_from_any_make_dropdown_in_used_cars_search_page(List<String> carMaker) {
	usedCarsSearchPageActions.selectCarMaker(carMaker.get(1));
}

@And("select  carModel from AnyModel dropdown in Used Cars Search page")
public void select_car_model_from_any_model_dropdown_in_used_cars_search_page(List<String> carModel) {
	usedCarsSearchPageActions.selectCarModel(carModel.get(1));  
}

@And("select location  from SelectLocation dropdown in Used Cars Search page")
public void select_location_from_select_location_dropdown_in_used_cars_search_page(List<String> location) {
	usedCarsSearchPageActions.selectLocation(location.get(1));  
}

@And("select price from maxprice dropdown in Used Cars Search page")
public void select_price_from_maxprice_dropdown_in_used_cars_search_page(List<String> price) {
	usedCarsSearchPageActions.selectPrice(price.get(1));   
}

@And("click on Find_My_Car button in Used Cars Search page")
public void click_on_find_my_car_button_in_used_cars_search_page() {
	usedCarsSearchPageActions.clickOnFindMyNextCarButton();
}

@Then("I should see list of Used cars")
public void i_should_see_list_of_used_cars() {
	System.out.println("Used car list populated");
}

@And("the page title should match expected title  {string}")
public void the_page_title_should_match_expected_title(String expectedPageTitle) {
	String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
    System.out.println("Actual page title-->"+ActualPageTitle);
    System.out.println("Expected page title-->"+expectedPageTitle);
    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
}

}
