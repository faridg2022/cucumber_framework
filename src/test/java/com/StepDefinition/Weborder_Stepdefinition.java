package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Weborder_Stepdefinition extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
		
			
		driver.get("https://www.google.com/");
	}

	@When("User Enter the keyword {string}")
	public void user_enter_the_keyword(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

	@When("User click on Search Button")
	public void user_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.name("btnK")).click();

	}

	@Then("Search result related to {string} word should display")
	public void search_result_related_to_word_should_display(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Search related to Selenium get Displayed");
//		driver.quit();
	}
	
	

	
	
//weborder
	
	@Given("User is on weborder login Page")
	public void user_is_on_weborder_login_page() {
		
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?11%2fWebOrders%2fDefault.aspx");
	}

	@When("User Enter the userName {string}")
	public void user_enter_the_user_name(String string) {
	   
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		
	}

	@Then("user enter the password {string}")
	public void user_enter_the_password(String string) {
	   driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	}

	@Then("User click on login Button")
	public void user_click_on_login_button() {
	    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("user should login to the home page")
	public void user_should_login_to_the_home_page() {
	  driver.findElement(By.id("ctl00_logout")).isDisplayed();

	}
	
	@When("User click on the logout button")
	public void user_click_on_the_logout_button() {
		
		driver.findElement(By.id("ctl00_logout")).click();
	}
	@Then("User should be taken back to the login page")
	public void user_should_be_taken_back_to_the_login_page() {
	    driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed();
		
	}
	
	
	
	
	
	@Then("User Clicks on Order link in TestComplete")
	public void user_clicks_on_order_link_in_test_complete() {
		driver.findElement(By.linkText("Order")).click();
	}
	@Then("User enters quantity, customer name, street, city, zip, card, card number, expire date in TestComplete")
	public void user_enters_quantity_customer_name_street_city_zip_card_card_number_expire_date_in_test_complete() {
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("2");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("Abc");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("xyz");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("1001");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("22/44");
	}
	@Then("User Click on Process Button in TestComplete")
	public void user_click_on_process_button_in_test_complete() {
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}
	@Then("User should see order success message in TestComplete")
	public void user_should_see_order_success_message_in_test_complete() {
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/strong")).isDisplayed();
//		driver.quit();
	}

	
	@Given("User is on weborder home Page")
	public void user_is_on_weborder_home_page() {
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?11%2fWebOrders%2fDefault.aspx");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String upass) {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(uname);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(upass);
	}

	@When("User click on Login button of Weborder")
	public void user_click_on_login_button_of_weborder() {
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}

	@Then("User should be in Home page and Logout button should display")
	public void user_should_be_in_home_page_and_logout_button_should_display() {
		driver.findElement(By.id("ctl00_logout")).isDisplayed();
	}
	
	
	@Then("User should get proper {string}")
	public void user_should_get_proper(String ExpectedResult) {
		if (ExpectedResult.equalsIgnoreCase("Invalid Login or Password.")) {
			String ActResult = driver.findElement(By.id("ctl00_MainContent_status")).getText();
			Assert.assertEquals(ActResult, ExpectedResult);
			
		} else 
		{
			String ActResult = driver.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(ActResult, ExpectedResult);
			driver.findElement(By.linkText("Logout")).click();
		}
	}

	
	
	
	

	



}
