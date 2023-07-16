package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCartButton;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		driverutilities.switchtab(driver);
		driverutilities.mousehover(driver, sd.getcoursebtn());
		sd.seleniumtrainingbtn();
		
		AddToCartButton a = new AddToCartButton(driver);
		driverutilities.doubleClick(driver, a.getplusbtn());
		a.addtocartbutton();
		driverutilities.alertPop(driver);
	}
}
