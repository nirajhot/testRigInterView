package common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObject.CommonAction;

public class Keyword extends CommonAction{

	public Keyword(WebDriver driver) {
		super(driver);
	}

	HashMap<String,Integer> getAllTagQue;

	public void waitElementPresent(){
		waitUntilElementClickable(getStackOverflowHeader());
		waitUntilElementClickable(getSideFooterNavBar());
		waitUntilElementClickable(getStackOverflowFooter());
	}

	public void scrollDownLast(){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		waitUntilElementClickable(getStackOverflowFooter());
	}

	public void count(){
		getAllTagQue = new HashMap<String,Integer>();
		for(int i=0; i<=getQueTag().size()-1; i++)
		{
			getAllTagQue.put(getQueTag().get(i).getText(),
					Integer.parseInt(getCountTag().get(i).getText().split(" ")[0].trim())); 
		}
		int maxValueInMap=(Collections.max(getAllTagQue.values()));

		for (Entry<String, Integer> entry : getAllTagQue.entrySet()) { 
			if (entry.getValue()==maxValueInMap) {
				System.out.println("The tag with name " + entry.getKey()+ " has maximum number of question count with "+ maxValueInMap + " questions");
			}
		}
	}
}