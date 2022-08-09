package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Repeat {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	String error=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissable']")).getText();
//		System.out.println("throws alert message"+error);
		
		
// String acttitile=driver.findElement(By.xpath("//div[text()='Welcome']")).getText();
//		
//String exptitle="elcome";
//if (acttitile.contains("exptitile")) {
//	System.out.println("log in success");
//	
//} else {
//	System.out.println("log in fail");
	//driver.close();

		driver.findElement(By.xpath("//span[text()='Send Message students']")).click();
		//driver.close();
		
Select sele	=new Select (driver.findElement(By.xpath("//select[@name='course_id']")));
sele.selectByVisibleText("testing");

		
}
	}


