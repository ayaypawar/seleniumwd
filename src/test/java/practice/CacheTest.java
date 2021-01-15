package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CacheTest 
{

	public static void main(String[] args) 
	{
		//Open Browser
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeDriver driver=new ChromeDriver();
		//LaunchSite
		GooglePage sp=new GooglePage(driver);
		driver.get("http://www.google.co.in");
		long x=System.currentTimeMillis();
		for(int i=1; i<1000; i++)
		{
			sp.mylink1.getText();
		}
		long y=System.currentTimeMillis();
		System.out.println("Time taken in seconds Without cache "+(y-x)/1000); //more time
		//Get text of link 1000times
		long z=System.currentTimeMillis();
		for(int i=1; i<1000;i++)
		{
			sp.mylink2.getText();
		}
		long w=System.currentTimeMillis();
		System.out.println("Time taken in seconds with cache "+(w-z)/1000);//9
		//close site
		driver.close();
		

	}

}
