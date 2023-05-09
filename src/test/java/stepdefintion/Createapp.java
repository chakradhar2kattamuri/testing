package stepdefintion;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Createapp {
	WebDriver driver;
	
	@Given("user alreay in log in page")
	public void user_alreay_in_log_in_page() {
		driver=new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");	
		driver.manage().window().maximize();
	    
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enter_username_and_password(String username,String password) {
		driver.findElement(By.id("UserName")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);    
	}

	@Then("user click on log in button")
	public void user_click_on_log_in_button() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('btnLogin').click()");
	    
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
		WebElement title=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/center/h1"));
		boolean in=title.isDisplayed();
		assertEquals(true, in);
	   
	}

	@Then("clicks on employee option")
	public void clicks_on_employee_option() {
		driver.findElement(By.xpath("//li[@class='treeview'][1]/a/i")).click();
	    
	}

	@Then("click on create option")
	public void click_on_create_option() {
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
	   
	}

	@Then("user is in create account page")
	public void user_is_in_create_account_page() {
		WebElement title=driver.findElement(By.xpath("//h3[text()='Employee Details']"));
		boolean id=title.isDisplayed();
		assertEquals(true, id);
		
		
	    
	}

	@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_and_and_and(String firstname, String lastname, String emailid, String phonenumber) {
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("EmailId")).sendKeys(emailid);
		driver.findElement(By.id("MobileNo")).sendKeys(phonenumber);
		
	}
	

	@Then("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
	}

@Then("close the browser")
public void close() {
	driver.quit();

	}
}
