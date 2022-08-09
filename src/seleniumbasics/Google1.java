package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println(driver.getCurrentUrl());
		String expurl="https://opensource-demo.orangehrmlive.com/";
		String acturl=driver.getCurrentUrl();
		System.out.println(expurl);
		
		if (acturl.equals(expurl)) {
			System.out.println("url launched successfully");
			
		} else {
			System.out.println("url launching failed");

		}
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).submit();
		String exptitle="Orange";
		String acttitle=driver.getTitle();
		System.out.println(exptitle);
		
		
		if (acttitle.contains(exptitle)) {
			System.out.println("login successfull with valid data");
			
		} else {
			System.out.println("log in failed with valid data");

		}

		
		
		
		
		
		Thread.sleep(2000);
		//driver.close();//to close current window which is  by the selenium


	}

}
