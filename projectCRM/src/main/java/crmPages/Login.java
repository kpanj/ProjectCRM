package crmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="i0116")
	private WebElement username;
	
	@FindBy(id="idSIButton9")
	private WebElement nextBTN;
	
	@FindBy(id="i0118")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement signinBTN;
	
	@FindBy(id="idBtn_Back")
	private WebElement noBTN;
	
	@FindBy(xpath="//div[text()='Sales Hub']")
	private WebElement salesHub;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void usernametf() {
		username.sendKeys("srvcqa@larsonjuhl.com");
	}
	public void nextbutton() {
		nextBTN.click();
	}
	public void passwordtf() {
		password.sendKeys("S0urceM@$h");
	}
	public void signinbutton() {
		signinBTN.click();
	}
	public void nobutton() {
		noBTN.click();
	}
	public void saleshubAPP() {
		salesHub.click();
	}
	
	
	
}
