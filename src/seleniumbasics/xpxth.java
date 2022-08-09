package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpxth {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());

		String acturl= driver.getCurrentUrl();
		String expurl="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.out.println(expurl);
		System.out.println(acturl);
		
		
		if (acturl.equals(expurl)) {
			System.out.println("login is sucesfull with valid test data");
		} else {
			System.out.println("login is failed with valid test data");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String acttittle= driver.getTitle();
		String exptittle="Orange";
		System.out.println(exptittle);
		System.out.println(acttittle);
		
		
		if (acttittle.contains(exptittle)) {
			System.out.println("login is sucesfull with valid test data");
		} else {
			System.out.println("login is failed with valid test data");
		}


		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		driver.close();//current window which is opend by selenium

	}

}
