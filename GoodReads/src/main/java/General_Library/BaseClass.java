package General_Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Repository.SignOut;
import Repository.SignPage;

public class BaseClass {
	WebDriver driver = null;

	@BeforeClass
	public void launchbrowser() throws IOException {
		String url = Read_data.UserCredentilas("url");
		driver = new ChromeDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		getDriver().get(url);

	}

	@BeforeMethod
	public void SignIn() throws IOException {
		SignPage SignIn = new SignPage(getDriver());
		SignIn.getSignIn().click();
		SignIn.getSignInWithEmailButton().click();
		SignIn.getEmailTextBox().sendKeys(Read_data.UserCredentilas("username"));
		SignIn.getPasswordTextBox().sendKeys(Read_data.UserCredentilas("password"));
		SignIn.getSignInButton().click();
	}
	@AfterMethod
	public void logout() {
		SignOut so = new SignOut(getDriver());
		so.getProfileButton().click();
		so.getSignOutButton().click();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
