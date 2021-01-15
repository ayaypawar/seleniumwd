package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Dummy4 
{
	//Properties
	public ChromeDriver driver;
	
	//<div> tag dropdown
	@FindBy(how=How.XPATH, using="//a[@id='selection']/following-sibling::div[2]")
	WebElement gender;
	
	//Constructor method
	public Dummy4(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Operational  method
	public void selectItmeByIndex(int x) throws Exception
	{
		gender.click();
		Thread.sleep(5000);
		List<WebElement> items=gender.findElements(By.xpath("child::div[2]/div"));
		if(items.size()<x)
		{
			System.out.println("Wrong index");
			System.exit(0);
		}
		
	}
	

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
