package windownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryui.com/draggable");
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		 driver.switchTo().frame(0);
		
		
		 WebElement drag =driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions act = new Actions(driver);
				 act.clickAndHold(drag).moveToElement(drop).release().build().perform();
				 Thread.sleep(2000);
				 driver.close();
		 
		

	}

}
