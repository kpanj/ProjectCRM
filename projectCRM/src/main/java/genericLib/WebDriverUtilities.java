package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	public void dropdown(WebElement ele , String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void mousehover(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightclick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	public void draganddrop(WebDriver driver,WebElement source,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void alertPop(WebDriver driver) {
		driver.switchTo().alert();
	}
	public void switchtoframe(WebDriver driver) {
		driver.switchTo().frame("AppLandingPage");
	}
	public void switchtoframe2(WebDriver driver) {
		driver.switchTo().frame("WebResource_lj_QuickNavonAccount");
	}
	
	public void switchbacktotheframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void switchtab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	public void scrollbar(WebDriver driver,int x,int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
//	public void explicitWait(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver,10);
//	}
	
	
	
	
	
	
	
}

