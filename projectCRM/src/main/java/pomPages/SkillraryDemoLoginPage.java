package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	@FindBy(xpath="//a[text() = 'COURSE']")
	private WebElement coursebtn;
	
	@FindBy(name= "addresstype")
	private WebElement coursedd;
	
	
	@FindBy(xpath = "(//a[text() = 'Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void seleniumtrainingbtn() {
		seleniumtraining.click();
	}
	
	public WebElement getcoursedd() {
		return coursedd;
	}
	
	public WebElement getcoursebtn() {
		return coursebtn;
	}
}
