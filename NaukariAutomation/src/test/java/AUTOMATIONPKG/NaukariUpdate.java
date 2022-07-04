package AUTOMATIONPKG;

import POMPKG.Homepage;
import POMPKG.LoginPage;
import POMPKG.ProfilePage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class NaukariUpdate extends BASE.BaseClass {
	WebDriver driver;
	LoginPage loginpage;
	Homepage homepage;
	ProfilePage profilepage;

  @BeforeTest
  public void launchbrwser1() 
  {
		  driver = launchchromebrowser();
  }
   
  @BeforeClass
	public void launchbrwser() throws EncryptedDocumentException, Exception
	{
			loginpage = new LoginPage(driver);
			driver.manage().window().maximize();
			loginpage.logintoNaukari(driver);			
	}

  @Test
  public void Profileupdate() throws InterruptedException
  {
		homepage = new Homepage(driver);
		homepage.Clickprofile();
		
		profilepage = new ProfilePage(driver);
		profilepage.updateresumehandler(driver);
		profilepage.updatersume();
		Thread.sleep(5000);
		profilepage.naukarilogout(driver);
		Thread.sleep(5000);
  }
  
  @AfterClass
  public void closedriver() throws InterruptedException
  {
	loginpage = null;
	homepage = null;
	profilepage = null;
	  
	driver.close();
	driver = null;
	System.gc();
  }

}
