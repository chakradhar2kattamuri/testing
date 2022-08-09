package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Launchinglogin {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");
//
//		WebDriver driver=new ChromeDriver();//launch the browser
//		driver.manage().window().maximize();
//
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\msedgedriver.exe");
//		WebDriver driver1=new EdgeDriver();//launch the browser
//		driver1.manage().window().maximize();
//		driver1.get("https://digitechinc.in/demos/1swishzz_staging/admin");

//		Thread.sleep(3000);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();//launch the browser
		driver2.get("https://digitechinc.in/demos/1swishzz_staging/admin");


	}

}
