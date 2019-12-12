package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
    public static WebDriver driver;
    public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SAURABH IT\\maven-archetype-quickstart\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		//prop.getProperty("browser");
		//String browserName=prop.getProperty("browser");
		String browserName=System.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			//execute in the chrome driver
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

             driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
		else if (browserName.equals("IE"))
		{
			
			
		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	} 


public void getScreenshots(String result ) throws IOException 
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C://shot//"+result+"Screenshot.png"));
}
}