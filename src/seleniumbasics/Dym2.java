package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dym2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//body/div[1]/section[1]/div[1]/div[1]/aside[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
		//html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1"]/td[1] frt r frt c
		///html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1 sec r frt c
//		int rows = driver.findElements(By.xpath("/html[1]]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
//	System.out.println(rows);
	int rows =	driver.findElements(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
		System.out.println(rows);
		int cols =	driver.findElements(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td")).size();
		System.out.println(cols);
		String firsthalfpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=cols; j++) {
				System.out.print(driver.findElement(By.xpath(firsthalfpath+i+"]/td["+j+"]")).getText()+"    ");
			}
			System.out.println();
	}
//		for (int i = 1; i <=rows; i++) {
//		String coursename= 	driver.findElement(By.xpath(firsthalfpath+i+ "]/td[1] ")).getText();
//		System.out.println(coursename);
//		
//if (coursename.equals("salesforcetraing+")) {
//	driver.findElement(By.xpath("//tbody/tr[4]/td[8]/a[2]/i[1]")).click();
//	break;
}
	

}
