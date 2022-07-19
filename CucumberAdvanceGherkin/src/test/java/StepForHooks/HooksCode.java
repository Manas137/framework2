package StepForHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksCode {

	WebDriver driver = null;

	
	@Before("@Smoke")
	public void setup() {
		System.out.println("Inside : setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	@Before(order=1)
	public void setup1() {
		System.out.println("Inside : Setup-1");
	}
	@Before(order=1)
	public void setup2() {
		System.out.println("Inside : Setup-2");
	}

	
	@After(value="@Smoke",order=2)
	public void teardown() {
		System.out.println("Inside : teardown");
		driver.close();
		driver.quit();
	}
	@After("@Smoke")
	public void teardown1() {
		System.out.println("Inside : teardown-1");
	}
	
	@BeforeStep
	public void bstep() {
		System.out.println("Inside : Before Step");
	}
	
	@AfterStep
	public void astep() {
		System.out.println("Inside : After Step");
	}

	@Given("I want to write a step with precondition")
	public void I_want_to_write_a_step_with_precondition() {
		System.out.println("Inside given : I want to write a step with precondition");
	}

	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("Inside and: some other precondition");
	}

	@When("I complete action")
	public void I_complete_action() {
		System.out.println("Inside when: I complete action");
	}

}
