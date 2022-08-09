package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		///html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]
//		 int rows = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr"))
//		System.out.println(rows);
		int rows = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr")).size();
		System.out.println(rows);
		int cols = driver.findElements(By.xpath("html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td")).size();
		System.out.println(cols);
		String firstpath ="html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[";
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=cols; j++) {
				System.out.print(driver.findElement(By.xpath(firstpath+i+"]/td["+j+"]")).getText()+"      " );
				
				
			}
			System.out.println();
			
		}
				
				
				

	}

}
