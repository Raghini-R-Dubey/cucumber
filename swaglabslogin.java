package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class swaglabslogin {
   
	WebDriver driver = null;

	@Given("browser is open.")
	public void browser_is_open() {
		System.out.println("inside step- swaglabs is open");
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
	}

	@And("user is on swag labs page.")
	public void user_is_on_swag_labs_page() {
		System.out.println("inside step- user is on swag labs page");
        driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("user enters the credentials in textfields.")
	public void user_enters_the_credentials_in_textfields()throws InterruptedException {
		System.out.println("inside step- user has entered credentials");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}

	@And("hits login.")
	public void hits_login() throws InterruptedException {
		System.out.println("inside step- user has login successfully");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page.")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside step- user is navigated to home page");
        driver.getPageSource().contains("Sauce Labs Backpack");
        driver.close();
        driver.quit();
	}
}

