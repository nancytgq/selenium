package nantest01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class tuozhuai {
	
	 public static void main(String[] args) throws InterruptedException {  
        // TODO Auto-generated method stub  
        System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\fwtlabb\\Downloads\\geckodriver.exe");            
        WebDriver driver = new FirefoxDriver();

		//Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
        
        
        //首先new出要拖入的页面元素对象和目标对象，然后进行拖入。  
        WebElement  element = driver.findElement(By.id("cstartingprinciple"));  
        WebElement  target = driver.findElement(By.id("cannualaddition"));  
        (new Actions(driver)).dragAndDrop(element, target).perform();  
          
        //利用循环把其它item也拖入  
//        String id="item" ;  
//        for(int i=2;i<=6;i++){  
//            String item = id+i;  
//            (new Actions(driver)).dragAndDrop(driver.findElement(By.id(item)), target).perform();  
        }  
    }  
