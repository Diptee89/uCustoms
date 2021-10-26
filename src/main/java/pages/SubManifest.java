package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.OR;
import test.Driver_Class;

public class SubManifest {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='submitbutton1']")
	static WebElement btnClose;
	@FindBy(xpath = "//*[@id='chkManifestsDisclaimer']")
	static WebElement chkManifestsDisclaimer;
	@FindBy(xpath = "//button[text()='Submit Manifest']")
	static WebElement btnSubmit_Manifest;
	@FindBy(xpath = "//*[@id='normalbutton1']")
	static WebElement btnOK;
	
	public SubManifest(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void clickManifestsDisclaimer_chk(String testData) {
		try {
			// Manifest Information Screen
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
						jse.executeScript("window.scrollBy(0,1100)");
						chkManifestsDisclaimer.click(); // Acknowledge check box
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickManifestsDisclaimer(String testData) {
		try {
			// Manifest Information Screen
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
						jse.executeScript("window.scrollBy(0,1100)");
						chkManifestsDisclaimer.click(); // Acknowledge check box
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickSubmit_Manifest_btn(String testData) {
		try {
			btnSubmit_Manifest.click(); // Submit Manifest
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickOK_btn(String testData) {
		try {
			btnOK.click(); // Ok
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
		
		
			
}
