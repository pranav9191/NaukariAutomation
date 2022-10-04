package BASE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver launchchromebrowser()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver","E:\\Automatiom\\chromedriver_Ver102\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
