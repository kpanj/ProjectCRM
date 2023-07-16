package crmScript;


//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import crmPages.AccountPage;
import crmPages.Login;
import genericLib.BaseClass;

public class TC_Login extends BaseClass{
	@Test
	public void testcase1() throws InterruptedException {
		Login l  = new Login(driver);
		l.usernametf();
		l.nextbutton();
		l.passwordtf();
		
		l.signinbutton();
		l.nobutton();
		
		driverutilities.switchtoframe(driver);
		l.saleshubAPP();
		Thread.sleep(2000);
		
		AccountPage ap = new AccountPage(driver);
		ap.myAccountButton();
		Thread.sleep(2000);
		ap.allAccountNorthAmericaButton();
		Thread.sleep(2000);
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		ap.searchFiltertf();
		Thread.sleep(2000);
		ap.quickArrowBtn();
		Thread.sleep(2000);
		ap.accountNameBtn();
		Thread.sleep(10000);
		
		driverutilities.switchtoframe2(driver);
		Thread.sleep(5000);
		ap.contactsTileBtn();
		Thread.sleep(2000);
		driverutilities.switchbacktotheframe(driver);
		Thread.sleep(2000);
		ap.summaryTabBtn();
		Thread.sleep(2000);
		
	}
	
	
}
