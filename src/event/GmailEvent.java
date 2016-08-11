package event;

import org.openqa.selenium.WebDriver;

import detail.LogInDetail;
import detail.SpamDetail;
import pages.LogInPage;
import pages.SpamPage;

public class GmailEvent {
	WebDriver driver;
	LogInDetail logindetail;
	SpamDetail spamdetail;

	LogInPage logInPage;
	SpamPage spamPage;

	public GmailEvent(WebDriver driver, LogInDetail logindetail) {
		this.driver = driver;
		this.logindetail = logindetail;
	//	this.spamdetail = spamdetail;

	}

	public GmailEvent(WebDriver driver) {
		this.driver = driver;

	}

	public void navigateToLogInForm() {
		// TODO Auto-generated method stub
		logInPage = new LogInPage(driver);
	}

	public void logIn(LogInDetail logindetail) {
		logInPage.enterEmailTextbox(logindetail.getEmail());
		logInPage.clickNextButton();
		logInPage.enterPasswordTextbox(logindetail.getPass());
		logInPage.clickLoginButton();
	}

	public void navigateToSpamEmail() throws InterruptedException {
		// TODO Auto-generated method stub
		spamPage = new SpamPage(driver);

	}

	public void spamEmail() {
		spamPage.clickDanhsachmorongButton();
		spamPage.clickSpamButton();
		spamPage.clickSlectMailButton();
		spamPage.clickSelectMailReadButton();
		spamPage.clickDeleteButton();
	}

}
