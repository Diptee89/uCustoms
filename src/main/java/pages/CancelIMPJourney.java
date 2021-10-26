package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class CancelIMPJourney {

	public static String impJourneyNo;
	public static String iMONumber;
	public static String vesselId;
	public static String shipName;
	public static String shipCallNo;
	public static String voyageNumber;
	public static String portOfOrigin;
	// ------------------------------------------Login------------------------------------
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
	// -----------------------------------------------------------------------------------------------
	@FindBy(xpath = "//*[@id='mb_ShipCargo']/a")
	static WebElement menuShipCargo;
	@FindBy(linkText = "Journey and Manifest")
	static WebElement subMenuJourneyAndManifest;
	@FindBy(linkText = "Import Journey")
	static WebElement nestedSubMenuImportJourney;
	
	
//	----------Search
	@FindBy(id = "JourneyNumber")
	static WebElement txtJourneyNumber;
	@FindBy(id="ShipCallNo")
	static WebElement txtShipCallNo;
	@FindBy(id="OrgPortName")
	static WebElement txtOrgPortName;
	@FindBy(id="ddlSearchCarrierType")
	static WebElement ddlSearchCarrierType;	
	@FindBy(xpath = "//*[@id='4']")
	static WebElement ddlStatus;
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[14]/td/div/input[1]")
	static WebElement btnSearch;
	@FindBy(xpath = "//*[@id=\"List_JourneyLs_0_ID0EBABAAA\"]/a/i")
	static WebElement list_JourneyLs;
	@FindBy(xpath = "//button[text()='Cancel Journey']")
	static WebElement btnCancelJourney;
	@FindBy(xpath = "//*[text()='Back']")
	static WebElement btnBack;

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
//============Create Import Journey
	
//	========Search

	
	public static void setJourneyNumber(String testData) {
		try {
			txtJourneyNumber.sendKeys(testData);
			
//			txtJourneyNumber.sendKeys(CargoImport.impJourneyNo);
//			 txtJourneyNumber.sendKeys(CargoImport.impJourneyNo);
//			 txtShipCallNo.sendKeys(CargoImport.shipCallNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setportOfOrigin(String testData) {
		try {			
//			 txtOrgPortName.sendKeys(testData);
			 txtOrgPortName.sendKeys(CargoImport.portOfOrigin);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void selectCarrierType(String testData) {
		try {
			OR.select(ddlSearchCarrierType, testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void selectStatus(String testData) {
		try {
			OR.select(ddlStatus, testData);
//			Select status = new Select(ddlStatus);
//			status.selectByVisibleText(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickSearch_btn(String testData) {
		try {
			btnSearch.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void clickOpenJourney(String testData) {
		try {
			list_JourneyLs.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
	public static void clickCancelJourney_btn(String testData) {
		try {
			btnCancelJourney.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
	@FindBy(id="frame_CancellationPg")
	static WebElement frame_CancellationReason;
	@FindBy(id="ddlCancellationReason")
	static WebElement ddlCancellationReason;
	@FindBy(id="txtRemarks")
	static WebElement txtRemarks;
	@FindBy(xpath="//*[@id=\"btnUpload\"]")
	static WebElement btnOK;
	public static void selectCancellationReason(String testData) {
		try {
			OR.driver.switchTo().alert().getText();
			OR.driver.switchTo().alert().accept();
			OR.driver.switchTo().frame(frame_CancellationReason);			
			OR.select(ddlCancellationReason, testData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void setCancellationRemarks(String testData) {
		try {
			txtRemarks.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	public static void clickOK(String testData) {
		try {
			btnOK.click();
			OR.driver.switchTo().parentFrame();
			btnBack.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}
	
}
