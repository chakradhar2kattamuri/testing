package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumProject\\exe\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		//dealing with calender
		
		String Expmtyr="July 2030";
		String expdt = "30";
		while (true) {
			String actmtyr= driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
			System.out.println("act mn&yr"+actmtyr);
		if (actmtyr.equals(Expmtyr)) {
			System.out.println("exp mt&yr is same as act mt&yr both are same");
			driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr/td[text() = "+expdt+"]")).click();
		} else {
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();

		}
		}

	}
	////body[1]/div[5]/table[1]/tbody[1]/tr[]/td[text()= ""]

}
