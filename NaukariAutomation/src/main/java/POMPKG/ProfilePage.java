package POMPKG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy (xpath = "/html/body/div[2]/div/div/span/div/div/div/div/div/div[2]/div[3]/div[3]/div/div/div/div[1]/span[2]")
	private WebElement Resumehandler;
	
	@FindBy (xpath = "//*[@id=\"resumeHeadlineTxt\"]")
	private WebElement Resumehandlerfield;
	
	@FindBy (xpath = "/html/body/div[5]/div[7]/div[2]/form/div[3]/div/button")
	private WebElement savebutton;
	
	
	@FindBy (xpath = "/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[4]/a")
	private WebElement logout;
	
	@FindBy (xpath = "//input[@id = 'attachCV']")
	private WebElement attachcv;
	
	@FindBy (xpath = "/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]")
	private WebElement mynaukari;
	
	
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void updateresumehandler(WebDriver driver)
	{
		String ResumeHandlertext = "I am an immediate joiner. An astute professional with 3.5 years of functional experience in Black Box (Manual Testing)includes Functional, Globalization, UI Testing, API & Webservice Testing using POSTMAN and Automation Testing Selenium with java.";
  		String ResumeHandlertext1 = "I am an immediate joiner. Total 3.5 years of experience in Manual Testing includes Functional, Globalization, UI Testing, API & Webservice Testing using POSTMAN and Automation Testing Selenium, Testng, Rest Assured, Maven with java.";
		
  		Resumehandler.click();
  		String Fieldtext = Resumehandlerfield.getText();
  		System.out.println(Fieldtext);
  		Resumehandlerfield.clear();
		if(Fieldtext.equals(ResumeHandlertext))
		{
			Resumehandlerfield.sendKeys(ResumeHandlertext1);
		}
		else
		{
			Resumehandlerfield.sendKeys(ResumeHandlertext);
		}
		savebutton.click();
	}
	
	public void updatersume()
	{
		attachcv.sendKeys("E:\\Resume.pdf");
	}
	 
	public void naukarilogout(WebDriver driver)
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", mynaukari);
		Actions act = new Actions(driver);
		act.moveToElement(mynaukari).perform();
		act.moveToElement(logout).click().perform();
	}
}