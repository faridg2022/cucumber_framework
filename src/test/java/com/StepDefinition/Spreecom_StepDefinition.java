package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Spreecom_StepDefinition extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();

	@Given("User is on demo.spreecom.org")
	public void user_is_on_demo_spreecom_org() {
		
	
		driver.get("https://demo.spreecommerce.org/");
	}

	@When("User click on the user icon")
	public void user_click_on_the_user_icon() {
		driver.findElement(By.id("account-button")).click();
	}

	@Then("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(2000);
	}

	@When("User should be taken to the login page")
	public void user_should_be_taken_to_the_login_page() {
		 driver.findElement(By.xpath("//h3[normalize-space()='Log in to continue']")).isDisplayed();
	}

	@Then("User enter valid email {string}")
	public void user_enter_valid_email(String string) {
		driver.findElement(By.xpath("//input[@id='spree_user_email']")).sendKeys("farid@spree.com");
	}

	@Then("User enter valid password {string}")
	public void user_enter_valid_password(String string) {
		driver.findElement(By.id("spree_user_password")).sendKeys("selenium");
	}

	@Then("User click on login submit button")
	public void user_click_on_login_submit_button() {
	   driver.findElement(By.name("commit")).click();
	}

	@When("User should be ended in the home page with wlcome message")
	public void user_should_be_ended_in_the_home_page_with_wlcome_message() {
		driver.findElement(By.xpath("//span[text()='Logged in successfully']")).isDisplayed();
		

	}

	
	// create address
	
	@Given("User click on add new address")
	public void user_click_on_add_new_address() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Add new address']")).click();
		Thread.sleep(2000);
	
	}

	@When("User is presenting a form to complete")
	public void user_is_presenting_a_form_to_complete() {
	    driver.findElement(By.xpath("//h3[normalize-space()='New Address']")).isDisplayed();
	}

	@Then("User enter first name, last name, address, city,state, zip code, coutnry, phone")
	public void user_enter_first_name_last_name_address_city_state_zip_code_coutnry_phone() throws InterruptedException {
	   driver.findElement(By.id("address_firstname")).sendKeys("farid");
	   driver.findElement(By.id("address_lastname")).sendKeys("g");
	   driver.findElement(By.id("address_address1")).sendKeys("100 john");
	   driver.findElement(By.id("address_city")).sendKeys("broolyn");
	   Thread.sleep(2000);
	   Select state = new Select(driver.findElement(By.id("address_state_id")));
	   state.selectByVisibleText("New York");
	   driver.findElement(By.id("address_zipcode")).sendKeys("10012");
	   Select country =  new Select(driver.findElement(By.id("address_country_id")));
	   country.selectByVisibleText("United States");
	   driver.findElement(By.id("address_phone")).sendKeys("21132142");
	  
	}

	@Then("User click on save button")
	public void user_click_on_save_button() {
		 driver.findElement(By.name("commit")).click();
	}

	@When("User should be successfully created address and see message new addres has been created")
	public void user_should_be_successfully_created_address_and_see_message_new_addres_has_been_created() {
	   driver.findElement(By.xpath("//span[normalize-space()='New address has been successfully created']")).isDisplayed();
	}
//@After
public void close() {
	driver.quit();
}
}
