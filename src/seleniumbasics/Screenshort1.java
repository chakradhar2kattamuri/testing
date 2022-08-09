package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort1 {
	static WebDriver driver1;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		 driver1=new ChromeDriver();//launch the browser
		driver1.manage().window().maximize();
		
		driver1.manage().deleteAllCookies();
		
		driver1.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver1.get("http://www.google.com");
		takescreenshot("googlepage");

	}
public static void takescreenshot(String filename) throws IOException {
File file =((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);//get screenshort file format
FileUtils.copyFile(file, new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\seliniun screenshort\\"+filename+"png"));

	
	 
	
}
}

