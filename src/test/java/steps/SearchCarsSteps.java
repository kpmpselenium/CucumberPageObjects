package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.SearchCarPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	SearchCarPageActions searchCarPageActions=new SearchCarPageActions();
	
	@Given("enter the url of the homepage carsguide.com.au as {string}")
	public void enter_the_url_of_the_homepage_carsguide_com_au_as(String webpageURL) {
	    SeleniumDriver.openPage(webpageURL);
	}

	@When("I  move to the available menu")
	public void i_move_to_the_available_menu(List<String> list) {
		String menu=list.get(1);
		System.out.println("Selected menu in homepage is: "+  menu);
		carsGuideHomePageActions.moveToBuyandSellMenu();
		
	    
	}

	@And("Select {string} from the options")
	public void select_from_the_options(String SearchCars) {
		carsGuideHomePageActions.clickSearchCarslink();
	}

	@And("Select car brans as {string} from AnyMakeDropdown")
	public void select_car_brans_as_from_any_make_dropdown(String carMake) {
		searchCarPageActions.selectCarMake(carMake);
	    
	}

	@And("Select car model {string} from AnyModelDropdown")
	public void select_car_model_from_any_model_dropdown(String carModel) {
		searchCarPageActions.selectCarModel(carModel);
	   
	}

	@And("Select location as {string} from LocationDropdown")
	public void select_location_as_from_location_dropdown(String location) {
		searchCarPageActions.selectLocation(location);
	}

	@And("Select {string} from MaxPriceDropdown")
	public void select_from_max_price_dropdown(String maxPrice) {
		searchCarPageActions.selectMaxPrice(maxPrice);
	}

	@And("click FindMyNextCarBtn")
	public void click_find_my_next_car_btn() {
		searchCarPageActions.clickFindMyNextCarBtn();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars()  {
	    
	    System.out.println("Car List Found");
	}


	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedPageTitle)  {
	    
	    String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	 
	}


}
