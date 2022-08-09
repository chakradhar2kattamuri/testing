package windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("http://www.keralartc.com/main.html");//parent window


		driver.findElement(By.xpath("//a[text()='E-Ticketing']")).click();//child window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='City Circular']")).click();
		//String window=driver.getWindowHandle();
		//System.out.println(window);
		//driver.switchTo().window(window);


		Set<String> wind=  driver.getWindowHandles();
		Iterator<String>  it=  wind.iterator();
		System.out.println(it.hasNext());
		String  parentwindow=it.next();//1st time
		System.out.println(it.hasNext());
		String citycircular= it.next();//2 nd time
		System.out.println(it.hasNext());
		String eticketingwindow= it.next();//3 rd time
		System.out.println(it.hasNext());
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.switchTo().window(eticketingwindow);
		Thread.sleep(2000);
		//driver.switchTo().window(citycircular);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'PNR Enquiry ')]")).click();
		
		//driver.close();
		//driver.quit();



	}

}
