package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");
		driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name ='submit']")).click();



//		String errormess=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]")).getText();
//
//		System.out.println("system through some errpr msg that is "+errormess);
		
		String acttittle = driver.findElement(By.xpath("//div[text()= 'admin']")).getText();
		String exptittle ="admin";
		System.out.println(acttittle);
		if (acttittle.contains(exptittle)) {
			System.out.println("log in sucessfull");
			
		} else {

			String errormess=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]")).getText();

			System.out.println("system through some error msg that is "+errormess);
		}
		
		driver.findElement(By.partialLinkText("Send Message")).click();
		 Select sele=new Select(driver.findElement(By.xpath("//select[@name ='course_id']")));
		 sele.selectByVisibleText("testing");
		 driver.findElement(By.xpath("//input[@name ='course_name']")).sendKeys("testing course");
		 driver.findElement(By.xpath("//input[@name ='course_slug']")).sendKeys("http://course.com");
		 driver.findElement(By.xpath("//textarea[@name ='course_desc_withoutCity']")).sendKeys("testing batch start soon");
		 driver.findElement(By.xpath("//input[@value ='Submit']")).submit();
		 Thread.sleep(2000);
		driver.close();
		
	}

}
