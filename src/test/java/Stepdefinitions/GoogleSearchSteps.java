package Stepdefinitions;

import io.cucumber.java.en.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Opening Browser");
	   driver.navigate().to("https://google.com");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//div[text()='Accept all']")).click();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("verifying user is on google search");
	    String actual = driver.getTitle();
	    String Expected = "Google";
	    if(Expected.equals(actual)) {
	    	System.out.println("We are on google page");
	    }
	    
	}

	@When("user enters a text")
	public void user_enters_a_text() {
		System.out.println("Entering search text");
	   driver.findElement(By.id("APjFqb")).sendKeys("Automation Step By Step");
	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("hitting enter");
	    driver.findElement(By.name("btnK")).click();
	}

	@Then("user gets the result")
	public void user_gets_the_result() {
	    System.out.println("Seeing result");
	    String title = driver.getTitle();
	    System.out.println("Title of the page is: " +title);
	    driver.close();
	}
	

}
