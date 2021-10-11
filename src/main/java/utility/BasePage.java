package utility;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}
	
	public void waitUntilElementVisible(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitUntilElementClickable(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitUntilElementVisibleClickable(WebElement element){
		wait.until(ExpectedConditions.visibilityOf(element)).click();;
	}
	
	public void waitUntilElementInVisible(WebElement element){
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public boolean isElementDisplayed(WebElement element){
		try{
			element.isDisplayed();
			return true;
		}catch(NoSuchElementException e){
			e.printStackTrace();
			return false;
		}
	}
}