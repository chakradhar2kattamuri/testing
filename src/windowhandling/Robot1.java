package windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Robot	act=new Robot();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		
	act.keyPress(KeyEvent.VK_DOWN);
	act.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	act.keyPress(KeyEvent.VK_DOWN);
	act.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	act.keyPress(KeyEvent.VK_DOWN);
	act.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	act.keyPress(KeyEvent.VK_DOWN);
	act.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	act.keyPress(KeyEvent.VK_ENTER);
		

	}

}
