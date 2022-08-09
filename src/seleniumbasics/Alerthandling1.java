package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerthandling1 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\jars\\chromedriver.exe");
	// System.setProperty("webdriver.Edge.driver", "C:\\Users\\hp\\Downloads\\jars\\EdgeDriver.exe");
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		////span[contains(text(),'Courses List')]
		////span[(text()='Courses List')]
		driver.findElement(By.xpath("//span[(text()='Courses List')]")).click();
		driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody/tr[1]/td[2]/a[1]")).click();
		Thread.sleep(3000);
		Alert alt =driver.switchTo().alert();
		//are you sure  you want to delete
		System.out.println( alt.getText());
		//alt.dismiss();
		alt.accept();
		Thread.sleep(3000);
		driver.close();



	}

}
