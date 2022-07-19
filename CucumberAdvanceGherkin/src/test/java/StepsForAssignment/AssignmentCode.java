package StepsForAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCode {
	WebDriver driver = null;
	
	@Given("user is in google page")
	public void user_is_in_google_page() {
		System.out.println("Inside: Open chrome browser");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@When("user searches for search")
	public void user_searches_for_search() {
		System.out.println("Inside: user enter search");

		WebElement searchData = driver.findElement(By.name("q"));
		searchData.sendKeys("Capgemini");
		searchData.sendKeys(Keys.ENTER);
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
		 System.out.println("Inside: Close the browser");
		   
		   driver.close();
		   driver.quit();
	}
	
	
	

	
	

}
