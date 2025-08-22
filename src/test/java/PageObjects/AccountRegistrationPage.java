package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='input-firstname']") WebElement Firstname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")  WebElement phone;
	@FindBy(xpath="//input[@id='input-password']")  WebElement pwd;
	@FindBy(xpath="//input[@id='input-confirm']")  WebElement cnfrpwd;
	@FindBy(xpath="//input[@value='Continue']")  WebElement btncontinue;
	public void setfrstname(String fname) {
		Firstname.sendKeys(fname);
	}
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void setemail(String cemail) {
		email.sendKeys(cemail);
	}
	public void settelephone(String cphone) {
		phone.sendKeys(cphone);
	}
	public void confirmpwd(String cpwd) {
		cnfrpwd.sendKeys(cpwd);
	}
	public void setpasswrd(String cpwd) {
		pwd.sendKeys(cpwd);
	}
	public void Clickbtn() {
		btncontinue.click();
	}
}
