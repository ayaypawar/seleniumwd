package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

public class LoginPage 

{
	//Properties for locating elements
	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.NAME, using="password")
	private WebElement pwd;
	
	@FindBy(how=How.XPATH, using="//[text()='Next']/following-sibling::div")
	private WebElement pwdnext;
	
	@FindBy(how=How.XPATH,using="//*[text()='Enter a password']")
	private WebElement blankpwderr;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Wrong password') or contains(text(),'Your password was changed')]")
	private WebElement invalidpwderr;
	
	public LoginPage(RemoteWebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.wait=wait;
	}
	//Operational methods to operate elements
	public void pwdfill(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys(x);
	}
	public void pwdnextclick()
	{
		wait.until(ExpectedConditions.elementToBeClickable(pwdnext)).click();
	}
	public boolean isBlankpwdError() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(blankpwderr));
		return(true);
	}
	public boolean isInvalidpwdError() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOf(invalidpwderr));
		return(true);
	}
	
	

}
