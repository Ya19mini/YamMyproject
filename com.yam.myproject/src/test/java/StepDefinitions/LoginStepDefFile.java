package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefFile {
	
	 WebDriver driver; //declared as static as we need to use in entire class
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver(); //no need to create webdriver class as per new sel4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		//driver.get("https://shcilestamp.com/eStampIndia/useradmin/UserAdminLoginServlet?rDoAction=LoadLoginPage");
		//PageFactory.initElements(driver, this);
	}

	@When("user gives correct UN& Pwd")
	public void user_gives_correct_un_pwd() {
	    // Write code here that turns the phrase above into concrete actions
		
	//	@FindBy(name = "userId")
	//	private WebElement userId;
		
		/* Nanna Estamp portal
		
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("apaddepu");
		driver.findElement(By.xpath("//input[@name='userPwd']")).sendKeys("Maya1234@");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	 */
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("addepalliyamini97@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Maya123@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

	}

	@And("click on login Button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
	    // Writss	e code here that turns the phrase above into concrete actions
	    System.out.println("login is successful");
	    
	}

}
