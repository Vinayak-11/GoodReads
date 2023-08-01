package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignPage extends good_Read {

	public SignPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Sign In")
	private WebElement SignIn;
	public WebElement getSignIn() {
		return SignIn;
	}
	public WebElement getSignUpWithEmail() {
		return SignInWithEmailButton	;
	}
	public WebElement getSignInWithEmailButton() {
		return SignInWithEmailButton;
	}
	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}
	public WebElement getSignInButton() {
		return SignInButton;
	}

	@FindBy(xpath = "//button[contains(text(),'Sign in with email')]")
	private WebElement SignInWithEmailButton;
	@FindBy(id = "ap_email")
	private WebElement EmailTextBox;
	@FindBy(id = "ap_password")
	private WebElement PasswordTextBox;
	@FindBy(id = "signInSubmit")
	private WebElement SignInButton;

}
