package seleniumbasics;

import org.apache.bcel.generic.ConstantPushInstruction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class chakri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\jars1\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground");
		 
//		WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[1]/ul/li[1]/a"));
//	//	 
//		
//		System.out.println( Element.getText());
//if (Element.isDisplayed()) {
//	System.out.println("element display sucessful ");
//	
//} else {
//System.out.println("element display fail");
//}
//
////String message = "welcome to lambdatest";
//Element.click();
//   
// driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("hii");
//  driver.findElement(By.xpath("//*[@id=\"showInput\"]")).click();

//  WebElement OutputBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]"
//  		+ "/section[3]/div/div/div[2]/div[1]/div[2]/div/div[2]"));
// WebElement OutputBox= driver.findElement(By.id("message"));
 
  //"//*[@id=\"user-message\"]"
//   String Message = OutputBox.getText();
//   System.out.println(Message);
//   
//   if (Message.contentEquals("hii")) {
//	 System.out.println("output validation is pass");
//	 
//} else {
//System.out.println("output validation is fail");
//}
//   driver.navigate().back();
//   Thread.sleep(2000);
//   driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div[1]/div[2]/ul/li[3]/a")).click();
//   Thread.sleep(2000);
//  
//    WebElement defaultslider =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[1]/div[1]/div/input"));
//    
//    Actions sliderAction = new Actions(driver);
//    sliderAction.dragAndDropBy(defaultslider, 115,0).build().perform();
    
    //verify the range
   
//   WebElement rangeValue = driver.findElement(By.xpath("//*[@id=\"range\"]"));
//   String rangeValueText = rangeValue.getText();
//    if (rangeValueText.equals("95")) {
//		System.out.println("slider automation test pass");
//	} else {
//     System.out.println("slider automation test failed");
//	}
//    
//    
//    driver.navigate().back();
    driver.findElement(By.partialLinkText("Input Form Submit")).click();
    
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[6]/button")).click();
    // error message
 // WebElement errormessage = driver.findElement(By.xpath("//div[@id='error-message']"));
// System.out.println( errormessage.getText());
    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("john");
    driver.findElement(By.xpath("//*[@id=\"inputEmail4\"]")).sendKeys("john@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"inputPassword4\"]")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("accenture");
    driver.findElement(By.xpath("//*[@id=\"websitename\"]")).sendKeys("http//www.johnaccenture.com");
    
    
    Select Dropdown = new Select(  driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]/div[1]/select")));
    Dropdown.selectByVisibleText("United States");
    
    		
    driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("washington");
    driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("8/110");
    driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys("dc");
    driver.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys("us");
    driver.findElement(By.xpath("//*[@id=\"inputZip\"]")).sendKeys("0001");
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[6]/button")).click();
    
   WebElement successmsg = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/p"));
   System.out.println(successmsg.getText());
    
  
   driver.close();
	}
	
} 
	
