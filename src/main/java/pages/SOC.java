package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import config.OR;
import test.Driver_Class;

public class SOC {
	

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
	@FindBy(partialLinkText = "Journey and Manifest")
	static WebElement subMenuJourneyManifest;
	@FindBy(partialLinkText = "Shut Out Certificate (SOC)")
	static WebElement nestedSubMenuSOC;
	// ------------------------------
	@FindBy(xpath = "//*[@title='New']")
	static WebElement btnNew;
	@FindBy(id = "txtJourney")
	static WebElement txtJourneyNumber;
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li/a")
	static WebElement autoCompleteDiv;
	@FindBy(id = "chkNo")
	static WebElement chkAckSOC;
	@FindBy(id = "btnCreate")
	static WebElement btnCreate;
	@FindBy(xpath = "//*[@id=\"SCShutOutCertificatesFr_Links_icon\"]/i")
	static WebElement lnkRepository;
	@FindBy(partialLinkText = "View / Upload Documents")
	static WebElement lnkUploadDoc;
	@FindBy(id = "FTPUploadDocs")
	static WebElement frame_FTPUploadDocs;
	@FindBy(id = "ddlDocumentTypes")
	static WebElement ddlDocumentTypes;
	@FindBy(id = "file_upload")
	static WebElement file_upload;
	@FindBy(id = "txtOther")
	static WebElement txtOther;
	@FindBy(id = "txtDocumentReferenceNo")
	static WebElement txtDocumentReferenceNo;
	@FindBy(id = "txtDescription")
	static WebElement txtRemarks;
	@FindBy(id = "btnUpload")
	static WebElement btnUpload;
	@FindBy(xpath = "//*[@id=\"MainDocument\"]/body/div[7]/div[11]/input")
	static WebElement btnClose;
	@FindBy(id = "btnSubmit")
	static WebElement btnSubmit;
	@FindBy(xpath = "//*[@title='Back']")
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

	public static void clickJourneyManifestSubMenu(String testData) {
		try {
			subMenuJourneyManifest.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSOCNested(String testData) {
		try {
			nestedSubMenuSOC.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	// ------------Create
	public static void clickNew_btn(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2000)");
			btnNew.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void setJourneyNo(String testData) {
		try {
			txtJourneyNumber.sendKeys(CargoImport.JourneyNo);
//			txtJourneyNumber.sendKeys(testData);
			Thread.sleep(3000);
			autoCompleteDiv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickAckSOC(String testData) {
		try {
			chkAckSOC.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickCreate(String testData) {
		try {
			btnCreate.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickUploadDoc(String testData) {
		try {
			lnkRepository.click();
			lnkUploadDoc.click();
			OR.driver.switchTo().frame(frame_FTPUploadDocs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;
		}
	}

	public static void selectDocument(String testData) {
		try {
//			OR.select(ddlDocumentTypes, testData);
			Select select = new Select(ddlDocumentTypes);
			select.selectByVisibleText(testData);
			if ("✘-O-OTHERS".equals(testData)) {
				txtOther.sendKeys("Other Documents");
			}
			file_upload.click();
			OR.upload();
			txtDocumentReferenceNo.sendKeys("DO989898");
			txtRemarks.sendKeys("Create Shipping Agent");
			btnUpload.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickClose(String testData) {
		try {
			OR.driver.switchTo().parentFrame();
			btnClose.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			Driver_Class.testResult = false;

		}
	}

	public static void clickSubmit_btn(String testData) {
		try {
			btnSubmit.click();
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
