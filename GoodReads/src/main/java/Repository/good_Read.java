package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class good_Read {

	public good_Read(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
