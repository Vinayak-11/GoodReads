package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut extends good_Read {

	public SignOut(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//img[@alt='Vinayak Malagavi']")
	private WebElement ProfileButton;
	@FindBy(linkText = "Sign out")
	private WebElement SignOutButton;
	public WebElement getProfileButton() {
		return ProfileButton;
	}
	public WebElement getSignOutButton() {
		return SignOutButton;
	}
	

}
