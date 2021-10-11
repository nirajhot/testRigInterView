package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.Keyword;
import utility.BaseClass;
import utility.Config;

public class GetTagWithMaxQueCount  extends BaseClass{

	private static Config rc = new Config();
	private static String LPT = rc.getLPT();
	private static String QTP = rc.getQTP();
	private static String TPT = rc.getTPT();

	Keyword cm;
	
	@Test(priority=0)
	public void browseQuestions(){
		Assert.assertTrue(LPT.equalsIgnoreCase(driver.getTitle()));
		cm=new Keyword(driver);
		cm.waitElementPresent();
		logger.info("Scrolling down");
		cm.scrollDownLast();
		takeScreen();
		waitFor(1000);
		logger.info("Clicking element");
		cm.getStackOverflowQuestionTag().click();
		cm.waitElementPresent();
	}

	@Test(priority=1)
	public void clickTag(){
		Assert.assertTrue(QTP.equalsIgnoreCase(driver.getTitle()));
		boolean condition = cm.getQuestionPageLeftNav().isDisplayed();
		try{
			if(condition==true){
				logger.info("Clicking element");
				cm.getQuestionPageTag().click();	
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		waitFor(1000);
		cm.waitElementPresent();
		takeScreen();
	}

	@Test(priority=2)
	public void clickNew(){
		Assert.assertTrue(TPT.equalsIgnoreCase(driver.getTitle()));
		cm.waitElementPresent();
		Assert.assertTrue(cm.getNewTag().isDisplayed());
		logger.info("Clicking element");
		cm.getNewTag().click();
		cm.waitUntilElementClickable(cm.getQueBrowse());
		takeScreen();
	}

	@Test(priority=3)
	public void getMaxCountQue(){
		Assert.assertTrue(TPT.equalsIgnoreCase(driver.getTitle()));
		cm.count();
		waitFor(1000);
		takeScreen();
	}
}