package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		 driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		takescreenshot("googlehomepage");

	}
	
	
	
	public static void takescreenshot(String filename) throws IOException {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//we will get the screen as file format
		
		FileUtils.copyFile(file, new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\screenshots\\"+filename+".png"));
		
		
	}
	

}
