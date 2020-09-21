package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class steps {
	WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		driver.close();
	}
	
	
	@Given("I am able to naviagte onto the login page")
	public void i_am_able_to_naviagte_onto_the_login_page() {
		
		driver.get("http://opensource-demo.orangehrmlive.com/");
	   
	}



	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		 driver.findElement(By.id("txtUsername")).sendKeys(string);
	  
	}
	@When("I Enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		   driver.findElement(By.id("txtPassword")).sendKeys(string);
	    
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	    
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		String expected = driver.findElement(By.id("welcome")).getText();
		   Assert.assertEquals(expected, string);
		   driver.findElement(By.id("welcome")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		   Thread.sleep(3000);
		   
	  
	}
	
	@Then("I should see a Error meassage as {string}")
	public void i_should_see_a_error_meassage_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 String getErrortext=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	        Assert.assertEquals("Valid Login",getErrortext,"Invalid credentials");
	       
	}



}
