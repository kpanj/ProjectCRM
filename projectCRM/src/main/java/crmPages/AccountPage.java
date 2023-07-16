package crmPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	@FindBy(xpath="//h1[@title='My Active Accounts']")
	private WebElement myAccountbtn;
	
	@FindBy(xpath="//label[text()='All Accounts - North America']")
	private WebElement allAccountNorthAmericaBtn;
	
	@FindBy(id="quickFind_text_0")
	private WebElement searchFilter;
	
	@FindBy(xpath="(//button[@title='Start search'])[1]")
	private WebElement quickArrow;
	
	@FindBy(xpath = "//span[text()='ATLANTA MISC. CUSTOMER!!']")
	private WebElement accountName;
	
	@FindBy(xpath="//p[text()='Contacts']")
	private WebElement contactsTile;
	
	@FindBy(xpath="//*[@id=\\\"tab0_1\\\"]")
	private WebElement summaryTab;
	
	public AccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void myAccountButton() {
		myAccountbtn.click();
	}
	public void allAccountNorthAmericaButton() {
		allAccountNorthAmericaBtn.click();
	}
	public void searchFiltertf() {
		searchFilter.sendKeys("52003");
	}
	public void quickArrowBtn() {
		quickArrow.click();
	}
	public void accountNameBtn() {
		accountName.click();
	}
	public void contactsTileBtn() {
		contactsTile.click();
	}
	public void summaryTabBtn() {
		contactsTile.click();
	}
	
}
