package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyWebsite {
	@FindBy(xpath="//a[text()='AUTHOR']")
	public WebElement authorbtn;
	
	public CompanyWebsite(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	public void authorbutton() {
		authorbtn.click();
	}
}
