package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpamPage {
	WebDriver driver;

	public SpamPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".J-Ke.n4.ah9.aiu")
	private WebElement btnDanhsachmorong;

	@FindBy(css = ".aBU")
	private WebElement btnSpam;

	@FindBy(css = ".T-I.J-J5-Ji.T-Pm.T-I-ax7.L3.J-JN-M-I")
	private WebElement btnSelectMail;

	@FindBy(css = ".SK.AX div:nth-child(3) ")
	private WebElement btnSelectMailRead;

	@FindBy(css = ".T-I.J-J5-Ji.aFi.T-I-ax7.ar7")
	private WebElement btnDelete;

	public void clickDanhsachmorongButton() {
		btnDanhsachmorong.click();
	}

	public void clickSpamButton() {
		btnSpam.click();
	}

	public void clickSlectMailButton() {
		btnSelectMail.click();
	}

	public void clickSelectMailReadButton() {
		btnSelectMailRead.click();
	}

	public void clickDeleteButton() {
		btnDelete.click();
	}

}
