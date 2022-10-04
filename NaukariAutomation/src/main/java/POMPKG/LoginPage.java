package POMPKG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id = 'usernameField']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id = 'passwordField']")
	private WebElement Password;
	
	@FindBy (xpath = "//button[@type = 'submit']")
	private WebElement LoginButton;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logintoNaukari(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.naukri.com/nlogin/login");
		username.sendKeys("pranavpadwal1231@gmail.com");
		Password.sendKeys("pranavpadwal1231@gmail.com");
		LoginButton.click();
	}
}
