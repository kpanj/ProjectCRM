package hmspompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="email")
	private WebElement emailtf;
	
	@FindBy(name="password")
	private WebElement pwdtf;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailtextfield() {
		emailtf.sendKeys("devishetty@gmail.com");
	}
	public void pwdtextfield() {
		pwdtf.sendKeys("devis999");
	}
	public void loginbutton() {
		loginbtn.click();
	}
	
	
}
