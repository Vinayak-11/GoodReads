package Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import General_Library.BaseClass;
import Repository.SearchTextBox;
/***
 * 
 * @author Vinayak
 *
 */
public class TC_001 extends BaseClass {
	@Test
	public void TC_001_test() throws InterruptedException {
		SearchTextBox sb = new SearchTextBox(getDriver());
		sb.getSearchTextBox().sendKeys("Never Lie", Keys.ENTER);
		Thread.sleep(2000);
		sb.getWantToReadButton().click();
		Thread.sleep(2000);
		sb.getMyBooksButton().click();
		Thread.sleep(2000);
		sb.getRemoveBookIcon().click();
		Thread.sleep(2000);
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
	}

}
