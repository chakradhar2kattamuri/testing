package calenderhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		//log in calendar
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		// to go to the calendar
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
		//handle the date
		Select selmnt=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		selmnt.selectByVisibleText("Aug");
		Select selyr=new Select (driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
		selyr.selectByVisibleText("2020");
		//driver.findElement(By.xpath("//tbody/tr[3]/td[5]/a[1]")).click();
		
		String expdt="12";
		driver.findElement(By.xpath("//tbody/tr/td/a[text()="+expdt+"]")).click();
		
		






	}

}
