package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://api.freecrm.com/register/");
		
	System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).isEnabled());
	System.out.println(driver.findElement(By.xpath("//a[contains(text(),'I Agree to the terms and conditions')]")).isSelected());
		
		
	
		
		

}
}