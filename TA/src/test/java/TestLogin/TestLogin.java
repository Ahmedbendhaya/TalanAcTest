package TestLogin;


	import java.time.Duration;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import LoginPage.LoginPage;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	
	public class TestLogin {
		
		WebDriver driver= null;
		LoginPage login;
		
		@Given("i am on TA login Page")
		public void i_am_on_TA_login_Page() {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is : "+projectPath);			
		    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.navigate().to("https://www.talan-academy.com/#login");
			System.out.print(driver.getCurrentUrl());
			driver.manage().window().maximize();
			login = new LoginPage(driver) ;
		}
		
		@When("I add my mail and password")
		public void i_add_my_mail() {
			login.Login_information("ahmed-baha-eddine.ben-dhaya@talan.com","22080023Ahm@d");
		}
		
		@When("click on OK")
		public void click_on_OK() {
			login.connect();
		}
		
		@Then("The dashboard will be opened")
		public void the_dashboard_will_be_opened() {
			login.Verifyconncorrect();
		}
		
		@Then("the browser must be closed")
		public void the_browser_must_be_closed() {
			driver.close();
		}
		@When("I insert my (.*) and (.*)$")
		public void i_insert_my_mail_and_password(String mail, String password) {
		    login.Login_information(mail, password);
		}

	}

