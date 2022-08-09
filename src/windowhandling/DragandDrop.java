package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryui.com/draggable");

		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(0);	
		Actions	act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		//drag.click();

		//driver.close();


	}

}
