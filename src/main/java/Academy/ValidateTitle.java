package Academy;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.base;

public class ValidateTitle extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());

	@Test

	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initizlized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to the Home Page");
		driver.manage().window().maximize();
		// one is inheritance
		// creating object of that class and invoke methods of it
		Landingpage l = new Landingpage(driver);

		l.getTitle().getText();
		// compare the text from browser from actual text. - Error--
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES12");
		Log.info("Successfully validated Text message");

	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
		driver=null;
	}
}