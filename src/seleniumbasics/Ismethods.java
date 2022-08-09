package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods {

	public static void main(String[] args) {
	

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();//launch the browser
//			driver.manage().window().maximize();
			driver.get("https://api.freecrm.com/register/");
//			System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Register')]")).isDisplayed());//bolean true
//			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());//bolean true
			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isEnabled());//bolean true
			//System.out.println(driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/input[2]")).isDisplayed());//bolean true
			
			
			System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).isEnabled());//true
			System.out.println(driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[3]/form[1]/div[2]/div[1]/div[1]/div[2]/div[103]")).isSelected());
		
			
	}

}
