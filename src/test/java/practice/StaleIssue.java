package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleIssue 
{

	public static void main(String[] args) throws Exception 
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//LaunchSite
		driver.get("http:www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Locate an element
		WebElement e=driver.findElement(By.name("identifier"));
		//Operate element and go to next page
		e.sendKeys("ajaypawar3129",Keys.ENTER);
		Thread.sleep(5000);
		e.sendKeys("pawarajay3351",Keys.ENTER);
		Thread.sleep(5000);
		//Close site
		driver.close();
		
		
		

	}

}
