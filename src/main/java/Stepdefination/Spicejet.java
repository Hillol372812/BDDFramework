package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Spicejet {
	WebDriver driver;
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\drivers\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		 driver.get("https://www.spicejet.com/default.aspx");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	//System.out.println("Browser successfully Open");    
	}

	@When("^User navigate to homepage$")
	public void user_navigate_to_homepage() throws Throwable {
		
		driver.findElement(By.xpath("//a[@title='Flights']")).click();
		
		System.out.println("User navigate to Homepage");
	    
	}

	@Then("^title of the page should match$")
	public void title_of_the_page_should_match() throws Throwable {
		String Title =driver.getTitle();
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets", Title);		
	  
	}
	@When("^Enter data in Departure City$")
	public void enter_data_in_Departure_City() throws Throwable {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("CCU");	
		Thread.sleep(2000);
	}

	@When("^Enter data in Arrival city$")
	public void enter_data_in_Arrival_city() throws Throwable {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("DEL");
		//driver.findElement(By.xpath("///div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//div[@class='search_options_menucontent']//div[@id='dropdownGroup1']//div[@class='dropdownDiv']//a[@value='IXU' and text()=' Aurangabad (IXU)']")).click();
	    
	}
	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']'")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()=12]")).click();
	    
	}

	@Then("^User navigate to Search Result Page$")
	public void user_navigate_to_Search_Result_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @name='ctl00$mainContent$btn_FindFlights']")).click();
		
		Thread.sleep(2000);
		String text =driver.findElement(By.xpath("//span[@class='bound-city uppercase']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@class='button-continue-text']")).click();
		
	    
	}
	@Then("^Enter traveller details$")
	public void enter_traveller_details() {
	    
		driver.findElement(By.xpath("//input[@id='CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxFirstName']")).sendKeys("Tom");
		driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxLastName")).sendKeys("Hank");
		driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxHomePhone")).sendKeys("9632154875");
		driver.findElement(By.id("CONTROLGROUPPASSENGER_ContactInputPassengerView_TextBoxEmailAddress")).sendKeys("Testy@gmail.com");
		driver.findElement(By.id("CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxFirstName_0")).sendKeys("Tom");
		driver.findElement(By.id("CONTROLGROUPPASSENGER_PassengerInputViewPassengerView_TextBoxLastName_0")).sendKeys("Hank");
		driver.findElement(By.xpath("//div[@id='continue-to-addons-page']//span[@class='button-continue-text']")).click();
		
	}

	@Then("^Select Options in AddsOn Page$")
	public void select_Options_in_AddsOn_Page() throws InterruptedException{
		driver.findElement(By.id("SpiceMaxSeatBtn")).click();
		driver.findElement(By.xpath("//input[@class='SMaxSeatAddon']")).click();
		driver.findElement(By.xpath("//div[@id='continue-to-payment-page']//span[@class='button-continue-text']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@id='continue-to-addons-page']//span[@class='button-continue-text']")).click();
	    
	}


}
