package nantest01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class tuofang {
	 public static void main(String[] args) throws InterruptedException
	  {
		 System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\fwtlabb\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.htmll");
		//driver.manage().window().maximize();
		 
	 	WebElement From = driver.findElement(By.xpath(".//*[@id='calinputtable']/tbody/tr[1]/td[1]"));
		WebElement To = driver.findElement(By.xpath(".//*[@id='calinputtable']/tbody/tr[2]/td[1]"));
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From)
				.moveToElement(To)
				.release(To)
				.build();
		dragAndDrop.perform();
		
		driver.close(); 
	 
	   }
}
