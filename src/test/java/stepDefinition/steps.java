package stepDefinition;

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
	
	@Given("I am able to naviagte to Homepage")
	public void i_am_able_to_naviagte_to_homepage() {
		
		driver.get("http://elearningm1.upskills.in/");
			}
	
	@When("I click on Sign up")
	public void i_click_on_sign_up() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		Thread.sleep(1000);
	}
	
	@Then ("Registration Screen Opens")
	public void registration_screen_opens() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul/li")).getText(),"Registration");
	}
	
	@Then("I Select what do you want to do")
	public void i_select_what_do_you_want_to_do() {
		
		driver.findElement(By.xpath("//*[@id=\"status-group\"]/div[1]/div[1]/label/p")).click();
	}
	
	@Then("I Enter First Name {string}")
	public void i_enter_first_name(String string) throws InterruptedException {
		driver.findElement(By.id("registration_firstname")).sendKeys(string);
		Thread.sleep(1000);	
	}
	
	@Then("I Enter Last Name {string}")
	public void i_enter_last_name(String string) throws InterruptedException {
		driver.findElement(By.id("registration_lastname")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I Enter e-mail {string}")
	public void i_enter_email(String string) throws InterruptedException {
		driver.findElement(By.id("registration_email")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I Enter Username {string}")
	public void i_enter_username(String string) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I Enter Pass {string}")
	public void i_enter_pass(String string) throws InterruptedException {
		driver.findElement(By.id("pass1")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I Enter Confirm Password {string}")
	public void i_enter_confirm_password(String string) throws InterruptedException {
		driver.findElement(By.id("pass2")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I Click Register")
	public void i_click_register() throws InterruptedException {
		
		driver.findElement(By.id("registration_submit")).click();
		Thread.sleep(3000);
	}
	
	@Then("I should see {string}")
	public void i_should_see(String string) throws InterruptedException {
		String expected = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1][1]")).getText();		                              
		Assert.assertEquals(expected, string); 
		 
	}
	
//	@Then("I see Your personal settings have been registered")
//	public void i_see_your_personal_settings_have_been_registered() throws InterruptedException {
//		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]/text()[2]")).toString(),"Your personal settings have been registered.");
//		Thread.sleep(3000);
//
//	}

	@Then("I click on profile")
	public void i_click_on_profile() throws InterruptedException {
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		Thread.sleep(3000);
	}

	@Then("I Validate e-mail {string}")
	public void i_validate_email(String string) {
		String expectedEmail = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		   Assert.assertEquals(expectedEmail, string); 	 
	}
	
	@Then("I navigate to homepage")
	public void i_navigate_to_homepage() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[1]")).click();
		
		Thread.sleep(3000);
	}
	
	@Then("I click on compose")
	public void i_click_on_compose() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
	}

	@Then("I should see compose message")
	public void i_should_see_compose_message() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul/li")).getText(), "Compose message");
	}
	
	@Then("I enter toemail {string}")
	public void i_enter_toemail(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(string);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li")).click();
		
		Thread.sleep(2000);	
	}
	
	@Then("I enter subject {string}")
	public void i_enter_subject(String string) throws InterruptedException {
		driver.findElement(By.id("compose_message_title")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I enter content {string}")
	public void i_enter_content(String string) throws InterruptedException {
		driver.findElement(By.xpath("/html/body")).sendKeys(string);
		Thread.sleep(1000);
	}
	
	@Then("I click on send")
	public void i_click_on_send() throws InterruptedException {
		
		driver.findElement(By.id("compose_message_compose")).click();
        Thread.sleep(2000);
	}
	
	@Then("I should see The message has been sent {string}")
	public void i_should_see_the_message_has_been_sent(String string) throws InterruptedException {
	//	String Expected = tofirstname + " " + tolastname + "(" + tousername + ")";
	//	String Message = "The message has been sent to " + string;
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]")).getText(), string);
		Thread.sleep(2000);
	}

	

}

