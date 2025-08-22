package TestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import net.bytebuddy.utility.RandomString;

public class TC_AccountRegistrationTest {
	WebDriver driver;
public void verify_account() {
	HomePage hp= new HomePage(driver);
	hp.clickmyaccount();
	hp.clickregster();
	AccountRegistrationPage ap= new AccountRegistrationPage(driver);
	ap.setfrstname("neha");
	ap.setlastname("garg");
	ap.setemail("xyz@gmail.com");
	ap.settelephone("345567889900");
	ap.setpasswrd("xyz123456");
	ap.confirmpwd("xyz123456");
	ap.Clickbtn();


}
}
