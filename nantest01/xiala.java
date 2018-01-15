package nantest01;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xiala {
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
		 
	    // Selecting an item from Drop Down list Box
		driver.findElement(By.id("ccompound")).getText();
		driver.findElement(By.xpath("//option[@value='daily']")).click();
		
		//Type dropdown =new type(driver.findElement(By.id("ccompound")));
		//dropdown.selectByValue("annually");
		
		//  you can also use dropdown.selectByIndex(1) to select second element as index starts with 0.
		//  You can also use dropdown.selectByValue("annually");    
	        
	    System.out.println("The Output of the IsSelected " + driver.findElement(By.id("ccompound")).isSelected());
	    System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("ccompound")).isEnabled());
	    System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("ccompound")).isDisplayed());
	    
	    driver.close(); 
	 
	   }
}
