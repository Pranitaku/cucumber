package com.stepdefenition1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer1 {
	static WebDriver driver;
	@Given("user is in telecom home page")
	public void user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("user click on add customer")
	public void user_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user is filling all the details")
	public void user_is_filling_all_the_details() throws InterruptedException {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		   driver.manage().window().maximize();
		   driver.findElement(By.id("fname")).sendKeys("kunal");
		   driver.findElement(By.id("lname")).sendKeys("kumar");
		   Thread.sleep(3000);
		   driver.findElement(By.id("email")).sendKeys("kumarkumar90981@gmail.com");
		   driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("chennai");
		   driver.findElement(By.id("telephoneno")).sendKeys("123423434");
		
	   
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user should get a valid customer id")
	public void user_should_get_a_valid_customer_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center']")).isDisplayed());
	    
	}



}
