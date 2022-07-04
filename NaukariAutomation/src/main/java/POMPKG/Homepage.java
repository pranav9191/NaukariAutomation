package POMPKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy (xpath = "//div[@title = 'Pranav Padwal']")
	private WebElement userProfile;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Clickprofile()
	{
		userProfile.click();
	}
}
