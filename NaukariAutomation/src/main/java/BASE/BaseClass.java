package BASE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver launchchromebrowser()
	{
		  System.setProperty("webdriver.chrome.driver","E:\\Automatiom\\chromedriver_Ver102\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  return driver;
	}
}
