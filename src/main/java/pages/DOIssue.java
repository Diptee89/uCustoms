package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.OR;
import test.Driver_Class;

public class DOIssue {

	WebDriver driver;
	@FindBy(xpath = "//*[@id='//*[@id=\\\"List_ManifestHouseBillLs_0_ID1EAABCAA\\\"]/a/i']")
	static WebElement chkList_ManifestHouseBillLs;
	@FindBy(xpath = "//button[text()='Create/View D.O.']")
	static WebElement btnCreateViewDO;
	@FindBy(xpath = "//button[text()='Issue D.O.']")
	static WebElement btnIssueDO;
	@FindBy(xpath = "//button[text()='OK']")
	static WebElement btnOK;
	
	
	public DOIssue(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}
	
	public static void clickList_ManifestHouseBillLs_chk(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,900)");
			chkList_ManifestHouseBillLs.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickCreateView_DO_btn(String testData) {
		try {
			btnCreateViewDO.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickIssueDO_btn(String testData) {
		try {
			btnIssueDO.click();
			btnOK.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
}
