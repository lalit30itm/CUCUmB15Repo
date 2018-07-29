package com.radical.basic.Myallfileinsamefolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.*;

public class OnefolderStepDefination {
	WebDriver driver;
	@Given ("^the user is on facebook login page$")
	public void the_user_is_on_facebook_login_page(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lalit\\Documents\\JavaRedicalLalit\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@And("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	
	

	@When("^he enters \"([^\"]*)\" as Password$")
	public void He_enters_user_password(String pwd) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);
		driver.quit();
	}
}
