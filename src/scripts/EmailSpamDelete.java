package scripts;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import builder.LogInDetailBuilder;
import detail.LogInDetail;
import event.GmailEvent;

@Test
public class EmailSpamDelete extends ScriptBase {
	WebDriver driver;

	public void test_DeleteSpamEmail() throws InterruptedException {
		LogInDetailBuilder logindetailbuilder = new LogInDetailBuilder();
		// SpamDetailBuilder spamdetailbuilder = new SpamDetailBuilder();

		logindetailbuilder.withEmail("kittenlove29051995@gmail.com").withPass("01051995");
		LogInDetail logindetail = logindetailbuilder.loginbuild();

		GmailEvent user = new GmailEvent(driver, logindetail);

		given(user).navigateToLogInForm();
		and(user).logIn(logindetail);
		and(user).navigateToSpamEmail();
		when(user).spamEmail();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
