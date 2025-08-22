package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
		WebDriver driver;
		
		
		@FindBy(xpath="//a[@title='My Account']") WebElement LnKmyaccount;
		@FindBy(xpath="//a[normalize-space()='Register']") WebElement Registeracc;
		public void clickmyaccount() {
			LnKmyaccount.click();
		}
		public void clickregster() {
			Registeracc.click();
		
	}}


