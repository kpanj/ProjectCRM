package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CompanyWebsite;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() {
		CompanyWebsite c = new CompanyWebsite(driver);
		driverutilities.switchtab(driver);
		c.authorbutton();
	}
}
