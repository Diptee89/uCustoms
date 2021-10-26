package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class ArriveJourney {
	WebDriver driver;

	@FindBy(xpath = "//*[@id='signin-link']/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id='sUserId']")
	static WebElement txtLoginId;
	@FindBy(xpath = "//*[@id='sUserPassword']")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id='signin-dropdown']/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a")
	static WebElement liSignOut;
	// ------------------------------------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(linkText = "Journey and Manifest")
	static WebElement subMenuJourneyAndManifest;
	@FindBy(linkText = "Import Journey")
	static WebElement nestedSubMenuImportJourney;
	// ------------------------------

	@FindBy(xpath = "//*[@id='JourneyNumber']")
	static WebElement txtJourneyNumber;
	@FindBy(xpath = "//*[@id='4']")
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id=\"List_JourneyLs_0_ID0EBABAAA\"]/a/i")
	static WebElement list_JourneyLs;
	@FindBy(xpath = "//*[@id='ArrivalDateHrs']")
	static WebElement ArrivalDateHrs;
	@FindBy(xpath = "//*[@id='btnArriveJourney']")
	static WebElement btnArriveJourney;
	@FindBy(xpath = "//button[text()='OK']")
	static WebElement btnOK;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;

	public ArriveJourney(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setLoginId(String testData) {
		try {
			liLogin.click();
			// txtLoginId.clear();
			txtLoginId.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			// txtPassword.clear();
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

	// -----------------------------Import Journey-------------------------
	public static void clickShipCargoMenu(String testData) {
		try {
			menuShipCargo.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickJourneyAndManifestSubMenu(String testData) {
		try {
			subMenuJourneyAndManifest.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickImportJourneyNestedSubMenu(String testData) {
		try {
			nestedSubMenuImportJourney.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

//	========Search
	@FindBy(id="ShipCallNo")
	static WebElement txtShipCallNo;
	@FindBy(id="OrgPortName")
	static WebElement txtOrgPortName;
	@FindBy(id="ddlSearchCarrierType")
	static WebElement ddlSearchCarrierType;
	public static void setJourneyNumber(String testData) {
		try {
			 txtJourneyNumber.sendKeys(CargoImport.JourneyNo);
			 txtShipCallNo.sendKeys(CargoImport.shipCallNo);
			 txtOrgPortName.sendKeys(CargoImport.portOfOrigin);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void selectCarrierType(String testData) {
		try {
			Select status = new Select(ddlSearchCarrierType);
			status.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void selectStatus(String testData) {
		try {
			Select status = new Select(ddlStatus);
			status.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSearcg_btn(String testData) {
		try {
			btnSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickJourneyLs(String testData) {
		try {
			list_JourneyLs.click();

			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectArrivalDateHrs(String testData) {
		try {
			Select arrivalDateHr = new Select(ArrivalDateHrs);
			// arrivalDateHr.selectByVisibleText(testData);
			arrivalDateHr.selectByIndex(8);
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickArriveJourney_btn(String testData) {
		try {
			btnArriveJourney.click();
			btnOK.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickBack_btn(String testData) {
		try {
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

}
