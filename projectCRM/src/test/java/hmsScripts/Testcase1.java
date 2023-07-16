package hmsScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import hmspompages.AddAppointmentPage;
import hmspompages.DoctorDashboardPage;
import hmspompages.LoginPage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() throws InterruptedException, IOException {
		LoginPage l = new LoginPage(driver);
		l.emailtextfield();
		l.pwdtextfield();
		l.loginbutton();
		Thread.sleep(3000);
		
		DoctorDashboardPage d = new DoctorDashboardPage(driver);
		d.appointmentdropdown();
		Thread.sleep(3000);
		d.appointmentlist();
		Thread.sleep(3000);
		d.addappointmentbutton();
		Thread.sleep(3000);
		
		AddAppointmentPage a = new AddAppointmentPage(driver);
		a.selectpatientbutton();
		Thread.sleep(3000);
		a.searchbutton();
		Thread.sleep(3000);
		driverutilities.doubleClick(driver, a.getcheckbox());
		a.submitbutton();
		Thread.sleep(3000);
	}
}
