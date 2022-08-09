package windownhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling1 {
	public static void main(String[] args) throws InterruptedException {




		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		//driver.get("https://www.keralartc.com/main.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='E-Ticketing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='City Circular']")).click();
		Thread.sleep(2000);
		//		String window = driver.getWindowHandle();
		//		System.out.println(window);
		//driver.switchTo().window(window);
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it =wind.iterator();

		String parentwindow =it.next();//1

		System.out.println( it.hasNext());
		String  circularwindow = it.next();//2


		System.out.println( it.hasNext());
		String ETicketingwindow = it.next();//3
		System.out.println( it.hasNext());
		driver.switchTo().window(ETicketingwindow);

		// it.next();
		//driver.findElement(By.xpath("//a[text() ='City Circular']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'PNR Enquiry ')]")).click();
		Thread.sleep(2000);
		driver.quit();
		//driver.close();

	}
}