package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
	
	private By Username = By.xpath("//input[@id='user_email']");
	private By Password = By.xpath("//input[@id='user_password']");
	private By Login = By.xpath("//input[@name='commit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public WebElement getLogin()
	{
		return driver.findElement(Username);
	}
	public WebElement username()
	{
		return driver.findElement(Username);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement login()
	{
		return driver.findElement(Login);
	}


}
