package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchTextBox extends good_Read {

	public SearchTextBox(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "q")
	private WebElement SearchTextBox;
	@FindBy(xpath = "//span[contains(text(),'Want to Read')]")
	private WebElement WantToReadButton;
	@FindBy(xpath = "(//span[contains(text(),'Never Lie')]/../..//span[contains(text(),'Want to Read')])[2]")
	private WebElement Book;
	@FindBy(linkText = "My Books")
	private WebElement MyBooksButton;
	@FindBy(xpath = "//img[@title='Remove from my books']")
	private WebElement RemoveBookIcon;
	
	public WebElement getSearchTextBox() {
		return SearchTextBox;
	}
	public WebElement getWantToReadButton() {
		return WantToReadButton;
	}
	public WebElement getBook() {
		return Book;
	}
	public WebElement getMyBooksButton() {
		return MyBooksButton;
	}
	public WebElement getRemoveBookIcon() {
		return RemoveBookIcon;
	}

}
