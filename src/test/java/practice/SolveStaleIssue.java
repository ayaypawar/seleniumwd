package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SolveStaleIssue 
{
	//Properties
			public ChromeDriver driver;
			@FindBy(how=How.NAME,using="identifier")
			WebElement e;
			//Constructor method
			public SolveStaleIssue(ChromeDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			

//Main method to run
	public static void main(String[] args) throws Exception 
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		SolveStaleIssue obj=new SolveStaleIssue(driver);
		//LaunchSite
		driver.get("http:www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Locate an element
		
		obj.e.sendKeys("ajaypawar3129",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		obj.e.clear();
		obj.e.sendKeys("pawarajay3351",Keys.ENTER);
		Thread.sleep(5000);
		//Close site
		driver.close();
		
		
		

	}

}
