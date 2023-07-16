package hmspompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardPage {
	@FindBy(xpath = "//span[text()='Appointment']")
	private WebElement appointmentdd;
	
	@FindBy(xpath = "//span[text()='Appointment List']")
	private WebElement appointmentlistlink;
	
	@FindBy(xpath = "//button[contains(text(),' Add Appointment')]")
	private WebElement addappointmentbtn;
	
	public DoctorDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void appointmentdropdown() {
		appointmentdd.click();
	}
	
	public void appointmentlist() {
		appointmentlistlink.click();
	}
	public void addappointmentbutton() {
		addappointmentbtn.click();
	}
}
