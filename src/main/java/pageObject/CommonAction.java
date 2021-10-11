package pageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BasePage;

public class CommonAction extends BasePage{

	public CommonAction(WebDriver driver) {
		super(driver);
	}

	@FindBy(css=".js-top-bar")
	private WebElement stackOverflowHeader;

	@FindBy(id="footer")
	private WebElement stackOverflowFooter;

	@FindBy(xpath="//a[text()='Questions']")
	private WebElement stackOverflowQuestionTag;

	@FindBy(css=".site-footer--nav")
	private WebElement sideFooterNavBar;

	@FindBy(id="left-sidebar")
	private WebElement questionPageLeftNav;

	@FindBy(id="nav-tags")
	private WebElement questionPageTag;

	@FindBy(css="[data-value='new']")
	private WebElement newTag;
	
	@FindBy(id="tags-browser")
	private WebElement questionBrowse;
	
	@FindBy(css=".post-tag")
	private List<WebElement> queTag;
	
	@FindBy(css=".s-card .mt-auto div:nth-child(1)")
	private List<WebElement> countTag;
	
	public WebElement getQuestionPageLeftNav() {
		return questionPageLeftNav;
	}

	public WebElement getQuestionPageTag() {
		return questionPageTag;
	}

	public WebElement getStackOverflowHeader() {
		return stackOverflowHeader;
	}

	public WebElement getStackOverflowFooter() {
		return stackOverflowFooter;
	}

	public WebElement getStackOverflowQuestionTag() {
		return stackOverflowQuestionTag;
	}

	public WebElement getSideFooterNavBar() {
		return sideFooterNavBar;
	}
	
	public WebElement getNewTag() {
		return newTag;
	}
	
	public WebElement getQueBrowse() {
		return questionBrowse;
	}
	
	public List<WebElement> getQueTag() {
		return queTag;
	}
	
	public List<WebElement> getCountTag() {
		return countTag;
	}
}