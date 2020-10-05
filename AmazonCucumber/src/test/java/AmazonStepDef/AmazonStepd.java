package AmazonStepDef;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import factoryPage.SubMenuPage;
import factoryPage.CategoryPageElement;

public class AmazonStepd  {
	WebDriver driver;
	SubMenuPage subMenuPage ;
	@Before
	public void before(){
	  driver = new ChromeDriver();
		driver.manage().window().maximize();

	 subMenuPage = new SubMenuPage(driver);
	}
	
	@Given("^user is on amazon homepage$")
	public void user_is_on_homepage()   {
		
	 	   driver.get("http://www.amazon.in");
	    
	}
	
	@When("^user selects a hamburger Menu from the top left menu$")
	public void user_navigates_to_hamburger_Menu()   {
		
		subMenuPage.OpenHamburgerMenu();
	}
	@When("^User selects a Sub menu option$")
	public void user_selects_a_Sub_menu_option(){
		
		subMenuPage.SelectcategoryfromHamburgermenu() ;
		
	}
	
	@When("^user selects category(.*) under Sub menu option$")
	public void selects_category_under_Sub_menu_option(String args)  {

		
	  subMenuPage.SelectfromSubMenu(args);
		
	}
	
	@Then("^Welcome to prime video message will be displayed$")
	public void success_message_will_be_displayed()  {
		
		String Expected="Welcome to Prime Video"; 
		String message= CategoryPageElement.Assert();
		System.out.println(message);
		Assert.assertTrue("Welcome to prime videos message does not displayed", message.contains(Expected));	



		
		
	}
	}



