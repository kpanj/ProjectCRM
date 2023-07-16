package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartButton {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[contains(text(), ' Add to Cart')]")
	private WebElement addtocartbtn;
	
	public AddToCartButton(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	public void addtocartbutton() {
		addtocartbtn.click();
	}
	public WebElement getplusbtn() {
		return plusbtn;
	}
}
