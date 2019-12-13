package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
 private	By LoginButton = By.xpath("//span[contains(text(),'Login')]");
 private	By Username = By.xpath("//input[@id='user_email']");
 private	By Password = By.xpath("//input[@id='user_password']");
 private 	By Login = By.xpath("//input[@id='user_password']");
 private	By Title = By.xpath("//h2[contains(text(),'Featured Courses')]");
 private	By NavBar = By.xpath("//a[contains(text(),'Contact')]");
	

	
	
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	public WebElement getLogin()
	{
		return driver.findElement(LoginButton);
	}

	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}

	public WebElement getNavBar()
	{
		return driver.findElement(NavBar);
	}

}
