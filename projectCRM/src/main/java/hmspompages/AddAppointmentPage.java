package hmspompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAppointmentPage {
	@FindBy(xpath="//span[text()='Select Patient']")
	private WebElement selectpatientbtn;
	
	@FindBy(xpath="(//input[@type=\"text\"])[6]")
	private WebElement searchbtn;
	
	@FindBy(id="notify")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbtn;
	
	public AddAppointmentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void selectpatientbutton() {
		selectpatientbtn.click();
	}
	public void searchbutton() {
		searchbtn.sendKeys("jon snow");
	}
	
	public WebElement getcheckbox() {
		return checkbox;
	}
	
	public void submitbutton() {
		submitbtn.click();
	}
}
