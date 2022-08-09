package calenderhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\jars\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//label[contains(text(),'Onward Date')]")).click();
		//deal with calendar

		//String	actmnyr=driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
		String expmnyr="July 2026";
		String expdt="26";
	while (true) {
			String	actmnyr=driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
			System.out.println("exp and act year is same"+actmnyr);
			if (actmnyr.equals(expmnyr)) {
				System.out.println("act month&year and exp month&year both are same");
				driver.findElement(By.xpath("//body[1]/div[5]/table[1]/tbody[1]/tr/td[text()="+expdt+"]")).click();
				break;
			} else {
				driver.findElement(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();

			}
		}

	}
}
