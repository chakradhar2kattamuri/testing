package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		//four commands
		//navigateto
		//refresh
		//backwaard
		//forward
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();

	driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");//used to launch the url
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
//		driver.navigate().to("http://www.google.com/");//used to launch the multiple urls with the same browser
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		//driver.get("http://www.google.com/");
//		ad.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		driver.close();
	

	}

}
