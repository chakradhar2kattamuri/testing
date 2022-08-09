package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcomands {

	public static void main(String[] args) throws InterruptedException {
		//navigate comands
		//navigaate To
		//refresh 
		//back
		//farward





		//https://digitechinc.in/demos/1swishzz_staging/admin

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");//new url
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//		driver.get("http://www.google.com");

		//		driver.navigate().to("http://www.google.com");//multiple url
		//		driver.navigate().back();
		//		driver.navigate().forward();
		//
		//		Thread.sleep(2000);
		//		driver.navigate().refresh();
		//		Thread.sleep(2000);
		driver.close();
	}

}
