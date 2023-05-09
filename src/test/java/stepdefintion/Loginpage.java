//package stepdefintion;
//
//import static org.junit.Assert.assertEquals;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class Loginpage {
//	WebDriver driver;
//	
//	@Given("user already in log in practicepage")
//	public void user_already_in_log_in_practicepage() {
//		driver=new ChromeDriver();
//		driver.get("https://magnus.jalatechnologies.com/");	
//		
//	}
////regluar expression
////	\"(.*)\"
//
//	@When("^user enter the \"(.*)\" and \"(.*)\"$")
//	public void user_enter_the_username_and_password(String username,String password) {
//		driver.findElement(By.name("UserName")).sendKeys(username);
//		driver.findElement(By.name("Password")).sendKeys(password);
//		    
//	}
//
//	@Then("user click on the submit button")
//	public void user_click_on_the_submit_button() {
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('btnLogin').click()");
//	   
//	}
//
//	@Then("user able to see the home page")
//	public void user_able_to_see_the_home_page() {
//		WebElement title=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/center/h1"));
//		boolean in=title.isDisplayed();
//		assertEquals(true, in);
//	}
//	@Then("close the browser")
//	public void close() {
//		driver.close();
//	}
//	}
