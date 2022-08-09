package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		//log in module
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Course Batche Schedules List')]")).click();
		
		//course batch schedule
		///html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]....first row first column
		///html[1]/body[1]/div[1]/section[1]/dion[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]iv[1]/div[1]/sect...second row first column
		///html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]...third row first column
		
	int	row=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr")).size();
		System.out.println(row);
	int	colu=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td")).size();
		System.out.println(colu);
	String	firsthalfpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
		
//		for (int i =1 ; i <=row; i++) {
//		for (int j = 1; j <=colu; j++) {
//			System.out.print(driver.findElement(By.xpath(firsthalfpath+i+"]/td["+j+"]")).getText()+"      ");
//				
//		}
//		System.out.println();
//		
			
			
	//	}
		for (int i = 1; i <=row; i++) {
		String	coursename=driver.findElement(By.xpath(firsthalfpath+i+"]/td[1]")).getText();
			//System.out.println(coursename);
			if (coursename.equals("Salesforce Training")) {
				driver.findElement(By.xpath("//tbody/tr[4]/td[8]/a[2]/i[1]")).click();
				break;
				
			}
			
		}

		
		
		
	}

}
