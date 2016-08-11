package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#Email")
	private WebElement txtEmail;

	@FindBy(css = "#next")
	private WebElement btnNext;

	@FindBy(css = "#Passwd")
	private WebElement txtPassword;

	@FindBy(css = "#signIn")
	private WebElement btnLogin;

	public void enterEmailTextbox(String text) {
		txtEmail.clear();
		txtEmail.sendKeys(text);

	}

	public void clickNextButton() {
		btnNext.click();
	}

	public void enterPasswordTextbox(String text) {
		txtPassword.clear();
		txtPassword.sendKeys(text);

	}

	public void clickLoginButton() {
		btnLogin.click();
	}

}
