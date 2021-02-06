package Stepdefination;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class makemytrp {
	 WebDriver driver;

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//Hillol//Desktop//Eclipse//Chrome driver//chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@When("^User navigate to launch the URL$")
	public void user_navigate_to_launch_the_URL() {
		
		driver.get("https://www.spicejet.com/default.aspx");
		
	  
	}

	@Then("^user in the maemytrip home page$")
	public void user_in_the_maemytrip_home_page()  {
		String Title= driver.getTitle();
		System.out.println("Title: "+Title);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", Title);
	    
	}

	@Given("^user in makemytrips home page$")
	public void user_in_makemytrips_home_page()  {
		
	Actions actn =	new Actions(driver);
	actn.moveToElement(driver.findElement(By.linkText("Special Offers"))).build().perform();
	driver.findElement(By.linkText("Domestic Schemes")).click();
	
	
	}

	@When("^Enter the Source$")
	public void enter_the_Source()  {
		
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ' and contains(text(), 'Search')]")).click();
	    
	}

	@When("^Destination with passenger details$")
	public void destination_with_passenger_details() throws Throwable {
	    
	}

	@When("^Click on Departure and select the date$")
	public void click_on_Departure_and_select_the_date() throws Throwable {
	   
	}

	@When("^Click on return date and select the date$")
	public void click_on_return_date_and_select_the_date() throws Throwable {
	  
	}

	

	@Then("^User in the search result page\\.$")
	public void user_in_the_search_result_page() throws Throwable {
	
	}



}
