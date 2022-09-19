package MAYBATCH.AMAZON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
     WebDriver driver;
     
     
	@FindBy (xpath="//input[@name=\"username\"]")
	private WebElement username ;
	
	@FindBy (xpath="//input[@name=\"password\"]")
	private WebElement passward ;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	private WebElement LoginButtom ;
	
	public Loginpage(WebDriver driver) throws InterruptedException
	{
		PageFactory.initElements( driver, this);
		Thread.sleep(2000);
	}
	
	public void sendUserName()
	{
		username.sendKeys("Admin");
	}
	
	public void sendPassward()
	{
		passward.sendKeys("admin123");
	}
	
	public void LoginButtom()
	{
		LoginButtom.click();
	}
	
}

