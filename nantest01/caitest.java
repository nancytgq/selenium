package nantest01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class caitest {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\fwtlabb\\Downloads\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			    //Launch website
				driver.navigate().to("http://www.calculator.net/percent-calculator.htmll");
				
//				//Maximize the browser
//				driver.manage().window().maximize();

			   	// Enter value 10 in the first number of the percent Calculator
			    driver.findElement(By.id("cpar1")).sendKeys("30");
			    
			    Thread.sleep(5000);
				
			    // Get the text box from the application
			   // String result = driver.findElement(By.id("cpar1")).getAttribute("value");
			    
			 // Enter value 50 in the second number of the percent Calculator
			    driver.findElement(By.id("cpar2")).sendKeys("90");
			    
			  //  Actions action=new Actions(driver);
			    //action.click("//d26tpo4cm8sb6k.cloudfront.net/img/svg/calculate.svg");
			    
			   driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();
			    
			    
			    String result = driver.findElement(By.xpath(".//*[@id='content']/h2[1]")).getText();
			   
			    
				//Print a Log In message to the screen
			    System.out.println(" The Result is " + result);
			    
				//Close the Browser.
			    driver.close();    
			  }
}
		
		
		
	//Instatiate the RC Server
	//DefaultSelenium selenium = new DefaultSelenium("localhost", 4444 , "firefox", "http://www.calculator.net");
	//selenium.start();   // Start
	//selenium.open("/");  // Open the URL
	//selenium.windowMaximize();

	// Click on Link Math Calculator
	//selenium.click("xpath=.//*[@id='menu']/div[3]/a");
	//Thread.sleep(2500); // Wait for page load
	
	// Click on Link Percent Calculator
//	selenium.click("xpath=.//*[@id='menu']/div[4]/div[3]/a");
	//Thread.sleep(4000); // Wait for page load
	
	
	// Focus on text Box
//	selenium.focus("name=cpar1");
	// enter a value in Text box 1
//	selenium.type("css=input[name=cpar1]", "10");

	// enter a value in Text box 2
	//selenium.focus("name=cpar2");
	//selenium.type("css=input[name=cpar2]", "50");
	
	// Click Calculate button
	//selenium.click("xpath=.//*[@id='content']/table/tbody/tr/td[2]/input");
	
	// verify if the result is 5
	//String result = selenium.getText(".//*[@id='content']/p[2]");

		
	//if (result == "5")
	//{
	//	System.out.println("Pass");
	//}else
	//{
	//	System.out.println("Fail");
	//}
		
	//}
//}
