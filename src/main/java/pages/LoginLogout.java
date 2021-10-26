package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.OR;
import test.Driver_Class;

public class LoginLogout {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"signin-link\"]/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id=\"sUserId\"]")
	static WebElement txtLoginId;
	@FindBy(xpath = "//*[@id=\"slider1_container\"]/div/div/div[2]/div[5]/div[1]/div[2]/div/input")
	static WebElement txtslider1_container;
	@FindBy(xpath = "//*[@id=\"sUserPassword\"]")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id=\"signin-dropdown\"]/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "//*[@id='submitbutton4']")
	static WebElement btnClose;
	@FindBy(xpath = "//*[@id='Container']/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[2]/center[2]/a")
	static WebElement btnBack;
	@FindBy(xpath = "//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a")
	static WebElement liSignOut;

	public LoginLogout(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
			OR.driver.getTitle();
			OR.takeSnapShot("Login");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickLider1_container(String testData) {
		try {
			txtslider1_container.click();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setLoginId(String testData) {
		try {
			liLogin.click();
			
			txtLoginId.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			txtPassword.clear();
			txtPassword.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickLoginBtn(String testData) {
		try {
			btnLoginInUcustoms.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCloseBtn_RegForm(String testData) {

		try {
			btnClose.click();
			System.out.println("Confirmation Alert massage : " + OR.driver.switchTo().alert().getText()); // Confirmation
																											// Alert
			OR.driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickInvalidID_Pass(String testData) {
		try {

			btnBack.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSignOut(String testData) {
		try {

			OR.driver.switchTo().defaultContent();
			liSignOut.click();
			// OR.driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

}
