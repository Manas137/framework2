package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationCode {

	WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside: user is on login page");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

//	@When("user enter the sagar and {int}")
//	@When("user enter the sagar and {int}")
//	public void user_enter_the_sagar_and(Integer int1) {
//		System.out.println("Inside: user enter the username and password");
//	}

	@When("^user enter ([^\"]*) and ([^\"]*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Inside: user enter " + username + " " + password);

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		
	}

	@And("cick on login button")
	public void cick_on_login_button() throws InterruptedException {
		System.out.println("Inside: click on login button");
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("^user is navigate to home page and ([^\"]*)$")
	public void user_is_navigate_to_home_page_and_country(String country) throws InterruptedException {
		System.out.println("Inside: user is navigate to home page and "+ country);
		
		// Select country india 
		
		Select dropdownCountry = new Select(driver.findElement(By.id("country")));
		dropdownCountry.selectByVisibleText(country);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("logout")).click();
		driver.quit();
	}

//	@When("user enter the manas and {int}")
//	public void user_enter_the_manas_and(Integer int1) {
//		System.out.println("Inside: user enter the username and password");
//	}

}
