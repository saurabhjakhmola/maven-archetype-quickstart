package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public static Logger Log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		
	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password, String Text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		 // one is inheritance
		// creating object of that class and invoke methods of it
		Landingpage l=new Landingpage(driver);
		l.getLogin().click();
		LoginPage lp= new LoginPage(driver);
		lp.username().sendKeys(Username);
		lp.Password().sendKeys(Password);
		lp.login().click();
		Log.info("Successfully validated the link");
	}

	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[2][3];
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="123456";
		data[1][2]="Non restricted user";
		
		return data;	
				

	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}