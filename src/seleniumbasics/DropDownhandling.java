package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://digitechinc.in/demos/1swishzz_staging/admin");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
//	String errormess=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissable']")).getText();
	//System.out.println("system throws some alert message"+errormess);
	//driver.close();
		
		
	String acttitle=driver.findElement(By.xpath("//div[text()='admin']")).getText();
	String exptitle="admin";
	
	if (acttitle.contains(exptitle)) {
		System.out.println("log in successfull");
	
	} else {
		System.out.println("log out failed");
	}
	
	driver.findElement(By.xpath("//a[@title='send_message_to_batches']")).click();//send message button
	//	driver.findElement(By.partialLinkText("Send Message")).click();
      Select sele=new Select ( driver.findElement(By.xpath("//select[@name='course_id']")));
       sele.selectByVisibleText("testing");
       driver.findElement(By.xpath("//input[@name='course_name']")).sendKeys("testing coiurse");
       driver.findElement(By.xpath("//input[@name='course_slug']")).sendKeys("http://www.log in");
       driver.findElement(By.xpath("//textarea[@name='course_desc_withoutCity']")).sendKeys("course completed");
       driver.findElement(By.xpath("//input[@name='submit']")).click();
    
		
		
//	String act=	driver.findElement(By.xpath("//span[text()='Send Message students']")).getText();
//		String exp="Send";
//		if (act.contains(exp)) {
//			System.out.println("log in successfully act");
       
//			
//			
//} else {
//	System.out.println("log out successfullexp");
//	driver.close();
		}
	
		
				

	}
	
		
		
		
		
		
		
		
		
		
		
		
	


