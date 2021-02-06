package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"C:\\drivers\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();		
//		driver.findElement(By.linkText("Features")).click();
//		Thread.sleep(200);
		
		 String Title = driver.getTitle();
		 
		// AssertJUnit.assertEquals("Consiga el software CRM #1 gratuito y empiece hoy", Title);
		 
		System.out.println("Actual Title" +Title);
	   
	}

	@When("^user enter login details$")
	public void user_enter_login_details(){
		System.out.println("Test2");
		driver.navigate().to("www.amazon.in");
		}

	@Then("^user in the home page$")
	public void user_in_the_home_page()  {
		System.out.println("Test3");
		
		driver.close();
	  
	}
	@When("^user in login details$")
	public void user_in_login_details() {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Sign in")).click();
	   
	}

	@Then("^user move to the home page$")
	public void user_move_to_the_home_page(){
		
		driver.close();
	    
	}
	
	
	
}
