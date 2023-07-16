package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtrainingbtn;
	
	@FindBy(xpath = "(//i[@class = 'fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	@FindBy(id="mycart")
	private WebElement mycart;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	public WebElement getseleniumtraining() {
		return seleniumtrainingbtn;
	}
	public WebElement getmycart() {
		return mycart;
	}
	public WebElement getfacebookicon() {
		return fbicon;
	}
	public void facebookicon() {
		fbicon.click();
	}
}
