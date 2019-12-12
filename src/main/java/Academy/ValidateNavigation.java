package Academy;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateNavigation extends base{
	public static Logger Log = LogManager.getLogger(base.class.getName());
@BeforeTest

public void initialize() throws IOException
{
	
	driver =initializeDriver();
	driver.get(prop.getProperty("url"));
}
	
	
	
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		 // one is inheritance
		// creating object of that class and invoke methods of it
		Landingpage l=new Landingpage(driver);

		Assert.assertTrue(l.getNavBar().isDisplayed());
		// compare the text from browser from actual text. - Error--
		
		Log.info("Successfully validated the display");
		
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}